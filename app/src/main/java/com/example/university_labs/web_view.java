package com.example.university_labs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class web_view extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        WebSettings webSettings= webView.getSettings();
        webSettings.getJavaScriptEnabled();
        webView.setWebViewClient(new WebViewClient());

        webView = findViewById(R.id.webView);
//        webView.loadUrl("https://google.com");

        webView.loadUrl("file:///android.assets/index.html/");
    }
}