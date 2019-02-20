package com.example.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.webview);
        webView.loadUrl("https://google.com");
    }
}
// web view is used for special characters like equations 1.by html 2.by link
// adds that come on insta are native ads because user dont know how closely ads mingle up
//one file in java other in kotlin then also successfully build but not both languages in same file
//git push and git pull are there try to use them