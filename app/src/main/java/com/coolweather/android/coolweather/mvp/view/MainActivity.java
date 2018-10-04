package com.coolweather.android.coolweather.mvp.view;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.coolweather.android.coolweather.R;

public class MainActivity extends FragmentActivity {
//    http://guolin.tech/api/china                  省 份
//    http://guolin.tech/api/china/16                 城市
//    http://guolin.tech/api/china/16/116           县城
//    http://guolin.tech/api/weather?cityid=CN101190401&key=bc0418b57b2d4918819d3974ac1285d9   详情
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
