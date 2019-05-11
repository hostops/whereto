package com.etilk.travel.whereto;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiException;
import io.swagger.client.api.DisplayResourceApi;
import io.swagger.client.api.UserDetailsResourceApi;
import io.swagger.client.model.DisplayDTO;
import io.swagger.client.model.UserDetailsDTO;

public class MainActivity extends AppCompatActivity {

    Button btnFriends;
    Button btnSettings;
    Button btnLogout;
    Button btnStart;
    Button btnDestinations;

    ImageView profileImageView;
    TextView loginTextView;

    private void initViews() {
        btnFriends = findViewById(R.id.btnFriends);
        btnSettings = findViewById(R.id.btnSettings);
        btnLogout = findViewById(R.id.btnLogout);
        btnDestinations = findViewById(R.id.btnDestinations);
        btnStart = findViewById(R.id.btnStart);
        profileImageView = findViewById(R.id.profileImageView);
        loginTextView = findViewById(R.id.loginTextView);


    }

    private void initListeners() {
        btnFriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btnDestinations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnDestinations();
            }
        });
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnStart();
            }
        });
    }

    private void btnStart() {
        Intent i = new Intent(this, DisplayActivity.class);
        startActivity(i);
    }

    private void btnDestinations() {
        Intent i = new Intent(this, RecommendationsActivity.class);
        startActivity(i);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initListeners();

        Intent i = new Intent(this, LoginActivity.class);
        startActivityForResult(i, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                String logged = data.getStringExtra("logged");
                getUser();
                loginTextView.setText(Client.username);

            }
            if (resultCode == Activity.RESULT_CANCELED) {
                Intent i = new Intent(this, LoginActivity.class);
                startActivityForResult(i, 1);
            }
        }
    }

    public void getUser() {
        UserDetailsResourceApi displayResourceApi = new UserDetailsResourceApi(Client.authenticatedApiClient);
        try {
            displayResourceApi.getUserDetailsByUserUsingGETAsync(Client.username, new ApiCallback<UserDetailsDTO>() {

                @Override
                public void onFailure(ApiException e, int i, Map<String, List<String>> map) {
                    e.printStackTrace();
                }

                @Override
                public void onSuccess(final UserDetailsDTO userDetailsDTO, int i, Map<String, List<String>> map) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            readyView(userDetailsDTO);
                        }
                    });
                }


                @Override
                public void onUploadProgress(long l, long l1, boolean b) {

                }

                @Override
                public void onDownloadProgress(long l, long l1, boolean b) {

                }
            });
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private void readyView(UserDetailsDTO userDetailsDTO) {
        byte[] decodedString = Base64.decode(userDetailsDTO.getImage(), Base64.DEFAULT);
        Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);

        profileImageView.setImageBitmap(decodedByte);
    }
}
