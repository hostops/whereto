package com.etilk.travel.whereto;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class KiwiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiwi);

        WebView webView = findViewById(R.id.webView);

        Intent intent = getIntent();
        webView.setWebViewClient(new MyWebViewClient(intent.getStringExtra("url")));
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl(intent.getStringExtra("url"));
    }

    private class MyWebViewClient extends WebViewClient {

        String url;
        public MyWebViewClient(String url) {
            this.url = url;
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(this.url);
            return true;
        }
    }
}
