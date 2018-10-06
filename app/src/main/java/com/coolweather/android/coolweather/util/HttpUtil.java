package com.coolweather.android.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * author:Created by YangYong on 2018/10/4.
 */
public class HttpUtil {


    public static void sendOkhttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }


}
