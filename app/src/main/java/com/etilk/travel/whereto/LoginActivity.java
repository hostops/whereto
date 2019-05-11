package com.etilk.travel.whereto;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;
import java.util.Map;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.UserJwtControllerApi;
import io.swagger.client.model.JWTToken;
import io.swagger.client.model.LoginVM;

public class LoginActivity extends AppCompatActivity {

    private Button submitButton;
    private EditText userView;
    private EditText passView;

    public void initViews() {
        submitButton = (Button) findViewById(R.id.submitButton);
        userView = (EditText) findViewById(R.id.userField);
        passView = (EditText) findViewById(R.id.passwordField);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login(userView.getText().toString(), passView.getText().toString());
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initViews();
    }

    private void failedLogin() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                showMessage("Login Failed");
            }
        });
    }

    private void logged(final String user) {
        System.out.println("Loged in as " + user);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                showMessage("Loged in as " + user);
            }
        });

        //todo: GIVE USERNAME TO CLIENT

        Intent returnIntent = new Intent();
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }

    public boolean login(final String user, String pass) {
        try {
            if (user == null || user.isEmpty() || pass == null || pass.isEmpty()) {
                return false;
            }
            LoginVM login = new LoginVM();
            login.setPassword(pass);
            login.setUsername(user);

            login.setRememberMe(Boolean.TRUE);
            final ApiClient client = new ApiClient().setBasePath("http://travel.etilk.com");
            UserJwtControllerApi authApi = new UserJwtControllerApi(client);
            authApi.authorizeUsingPOSTAsync(login, new ApiCallback<JWTToken>() {
                @Override
                public void onFailure(ApiException e, int i, Map<String, List<String>> map) {
                    e.printStackTrace();
                    failedLogin();
                }

                @Override
                public void onSuccess(JWTToken jwtToken, int i, Map<String, List<String>> map) {
                    JWTToken token =jwtToken;
                    Client.authenticatedApiClient = new ApiClient().setBasePath("http://travel.etilk.com");
                    Client.authenticatedApiClient.setAccessToken(token.getIdToken());
                    logged(user);
                }

                @Override
                public void onUploadProgress(long l, long l1, boolean b) {

                }

                @Override
                public void onDownloadProgress(long l, long l1, boolean b) {

                }
            });
            return true;

        } catch (NullPointerException | IndexOutOfBoundsException | ApiException ex) {
            if (ex instanceof ApiException) {
                switch (((ApiException) ex).getCode()) {
                    case 401:
                        System.out.println("User name or password is invalid. Please try again.");
                        break;
                    default:
                        System.out.println("Error:" + ex.getMessage());

                }
                failedLogin();
            }
            return false;
        }
    }

    private void showMessage(String message) {
        String text = message;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(this, text, duration);
        toast.show();
    }
}
