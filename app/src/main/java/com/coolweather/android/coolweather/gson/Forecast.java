package com.coolweather.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * author:Created by YangYong on 2018/10/4.
 */
public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
