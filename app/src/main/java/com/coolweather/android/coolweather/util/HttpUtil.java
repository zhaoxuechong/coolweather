package com.coolweather.android.coolweather.util;

import android.widget.Toast;

import org.litepal.LitePalApplication;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * author:Created by YangYong on 2018/10/4.
 */
public class HttpUtil {
    private static boolean networkAvailable;

    public static void sendOkhttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
        if (!isNetworkAvailable()) {

            Toast.makeText(LitePalApplication.getContext(),"当前网络不稳定，请重试",Toast.LENGTH_LONG).show();
            return;
        }
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }

    public static boolean isNetworkAvailable() {
        return networkAvailable;
    }
}
