package com.alitajs.miniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.alitajs.micro.AlitaAgent;
import com.alitajs.micro.ui.activity.MicroAppActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlitaAgent.getWebView().loadUrl("file:///android_asset/www/index.html");
        Intent intent = new Intent(this, MicroAppActivity.class);
        intent.putExtra("needTopbar", false);
        startActivity(intent);
        finish();
    }
}