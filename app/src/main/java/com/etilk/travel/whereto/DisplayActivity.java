package com.etilk.travel.whereto;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiException;
import io.swagger.client.api.DisplayResourceApi;
import io.swagger.client.api.LocationResourceApi;
import io.swagger.client.model.DisplayDTO;
import io.swagger.client.model.LocationDTO;

public class DisplayActivity extends AppCompatActivity {

    ImageView displayImageView;
    Button btnLike;
    Button btnDislike;

    Integer count = 0;

    DisplayDTO displayDTO;

    private void initViews() {
        displayImageView = findViewById(R.id.displayImageView);
        btnLike = findViewById(R.id.btnLike);
        btnDislike = findViewById(R.id.btnDislike);
    }

    private void initListeners() {
        btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liked();
            }
        });

        btnDislike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disliked();
            }
        });
    }

    private void disliked() {
        btnDislike.setEnabled(false);
        btnLike.setEnabled(false);
        count++;
        getLocations(count);
    }

    private void liked() {
        btnDislike.setEnabled(false);
        btnLike.setEnabled(false);
        count++;
        getLocations(count);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        initViews();
        initListeners();
        getLocations(0);
    }

    public void setDisplayDTO(List<DisplayDTO> locationDTOS) {
        this.displayDTO = locationDTOS.get(0);
    }

    public void getLocations(Integer i) {
        DisplayResourceApi displayResourceApi = new DisplayResourceApi(Client.authenticatedApiClient);
        try {
            displayResourceApi.getAllDisplaysUsingGETAsync(true, i, 1, new ArrayList<String>(),new ApiCallback<List<DisplayDTO>>() {

                @Override
                public void onFailure(ApiException e, int i, Map<String, List<String>> map) {
                    e.printStackTrace();
                }

                @Override
                public void onSuccess(List<DisplayDTO> displayDTOS, int i, Map<String, List<String>> map) {
                    setDisplayDTO(displayDTOS);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            readyView();
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

    private void readyView() {

        byte[] decodedString = Base64.decode(displayDTO.getImage(), Base64.DEFAULT);
        Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);

        btnDislike.setEnabled(true);
        btnLike.setEnabled(true);
        displayImageView.setImageBitmap(decodedByte);

        System.out.println("ok");
    }
}
