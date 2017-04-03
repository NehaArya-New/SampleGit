package com.example.mac.samplegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
//import com.nexref.visualintuition.sdk.activities.VICameraActivity;


public class MainActivity extends AppCompatActivity{

//    private final String mCssString = "<script type="text/javascript" src="main/assets/js/jsfile.js"/>";
    private WebView mWebview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        preloadVideo(true);

        Button arButton=(Button)findViewById(R.id.ar_button);
        arButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, com.nexref.visualintuition.sdk.activities.VICameraActivity.class));

            }
        });

//        mWebview = (WebView)findViewById(R.id.webView);
//        mWebview.getSettings().setJavaScriptEnabled(true);
//        mWebview.setWebChromeClient(new WebChromeClient());
//        mWebview.getSettings().setDomStorageEnabled(true);
//        mWebview.loadUrl("file:///android_asset/game.html");
//
//    }
//
//    private class WebViewClient extends android.webkit.WebViewClient
//    {
//        @Override
//        public boolean shouldOverrideUrlLoading(WebView view, String url)
//        {
//            return super.shouldOverrideUrlLoading(view, url);
//        }


    }







}
