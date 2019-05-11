package com.etilk.travel.whereto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ListView;
import android.widget.ScrollView;

import com.etilk.travel.whereto.adapters.RecommendationsSlideAdapter;

import java.util.List;
import java.util.Map;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiException;
import io.swagger.client.model.LocationDTO;

public class RecommendationsActivity extends AppCompatActivity {


    ListView recommendationsScrollView;
    HorizontalScrollView usersScrollView;
    Button btnMergeFriend;


    
    private void initViews() {
        recommendationsScrollView = findViewById(R.id.recommendationsScrollView);
        usersScrollView = findViewById(R.id.usersScrollView);
        btnMergeFriend = findViewById(R.id.btnMergeFriend);
    }

    private void initListeners() {
        btnMergeFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mergeFriend();
            }
        });
    }

    private void startIntent(String url) {
        Intent i = new Intent(this, KiwiActivity.class);
        i.putExtra("url", url);
        startActivity(i);
    }

    private void mergeFriend() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendations);

        initViews();
        initListeners();

        Client.getPreferedLocation(new ApiCallback<List<LocationDTO>>() {
            @Override
            public void onFailure(ApiException e, int i, Map<String, List<String>> map) {
                e.printStackTrace();
            }

            @Override
            public void onSuccess(final List<LocationDTO> locationDTOS, int i, Map<String, List<String>> map) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        setAdapters(locationDTOS);
                    }
                });
            }

            @Override
            public void onUploadProgress(long l, long l1, boolean b) {

            }

            @Override
            public void onDownloadProgress(long l, long l1, boolean b) {

            }
        }, 5);
    }

    private void setAdapters(List<LocationDTO> locationDTOS) {
        RecommendationsSlideAdapter recommendationsSlideAdapter = new RecommendationsSlideAdapter(this, locationDTOS) {
            @Override
            public void checked(LocationDTO locationDTO) {
                String url = "https://www.kiwi.com/us/search?nomad=--~~--%3B---~---~--%3B";
                url+=locationDTO.getKiwiId() + "~-~--%3B";
                url+="-~-~--";

                startIntent(url);
            }
        };
        recommendationsScrollView.setAdapter(recommendationsSlideAdapter);

    }
}
