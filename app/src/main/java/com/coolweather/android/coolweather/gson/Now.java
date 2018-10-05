package com.coolweather.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * author:Created by YangYong on 2018/10/4.
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
