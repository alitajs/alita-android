package com.alitajs.miniapp;

import android.app.Application;

import com.alitajs.micro.AlitaConfigure;


public class MainAppliction extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AlitaConfigure.init(this,"e222cc5713a348aeb1b01f44909854ad");
    }
}
