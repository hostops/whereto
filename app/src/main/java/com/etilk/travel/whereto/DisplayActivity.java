package com.etilk.travel.whereto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DisplayActivity extends AppCompatActivity {

    ImageView displayImageView;
    Button btnLike;
    Button btnDislike;

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
}
