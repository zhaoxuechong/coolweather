package com.coolweather.android.coolweather;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

import org.litepal.LitePalApplication;

/**
 * author:Created by YangYong on 2018/10/4.
 */
public class MyApplication extends Application {

    private static Context context;

    @SuppressLint("MissingSuperCall")
    @Override
    public void onCreate() {
        context = getApplicationContext();
        LitePalApplication.initialize(context);
    }


    public static  Context getContext(){
        return context;
    }


}
