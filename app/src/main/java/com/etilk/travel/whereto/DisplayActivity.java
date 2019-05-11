package com.etilk.travel.whereto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.gson.Gson;

import java.util.List;
import java.util.Map;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiException;
import io.swagger.client.api.LocationResourceApi;
import io.swagger.client.model.LocationDTO;

public class DisplayActivity extends AppCompatActivity {

    ImageView displayImageView;
    Button btnLike;
    Button btnDislike;

    List<LocationDTO> locationDTOS;

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
    }

    private void liked() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
    }

    public void getLocations() {
        LocationResourceApi locationResourceApi = new LocationResourceApi(Client.authenticatedApiClient);
        try {
            locationResourceApi.getAllLocationsUsingGETAsync(new ApiCallback<LocationDTO>() {
                @Override
                public void onFailure(ApiException e, int i, Map<String, List<String>> map) {
                    e.printStackTrace();
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            resetView();
                        }
                    });
                }

                @Override
                public void onSuccess(LocationDTO locationDTO, int i, Map<String, List<String>> map) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            resetView();
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
}
