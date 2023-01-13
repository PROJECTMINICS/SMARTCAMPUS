package com.saurabhjadhav.smartcampus.ComplaintAAP;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.saurabhjadhav.smartcampus.R;

public class ComplaintAAP extends AppCompatActivity {

    WebView webViewOfficial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint_aap);

        webViewOfficial = findViewById(R.id.webviewComplaint);

        webViewOfficial.setWebViewClient(new WebViewClient());
        webViewOfficial.getSettings().setJavaScriptEnabled(true);
        webViewOfficial.loadUrl("http://10.246.246.222/aap/");

    }
}