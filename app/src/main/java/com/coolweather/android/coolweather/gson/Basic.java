package com.coolweather.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * author:Created by YangYong on 2018/10/4.
 */
public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
