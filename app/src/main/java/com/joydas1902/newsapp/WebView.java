package com.joydas1902.newsapp;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class WebView extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        Intent intent = getIntent();
        String url = intent.getStringExtra("url");

        android.webkit.WebView webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }
}