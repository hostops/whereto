package com.etilk.travel.whereto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;

public class RecommendationsActivity extends AppCompatActivity {


    ScrollView recommendationsScrollView;
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

    private void mergeFriend() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendations);
    }
}
