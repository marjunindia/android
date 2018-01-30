package com.example.arjun_mu.a22webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class PageNavigation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_navigation);

        WebView myWebView = (WebView) findViewById(R.id.web_view1);

        myWebView.loadUrl("file:///android_asset/index.html");
        myWebView.setWebViewClient(new MyWebViewClient(this));
    }
}
