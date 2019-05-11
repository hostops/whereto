package com.etilk.travel.whereto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

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

    }
}
