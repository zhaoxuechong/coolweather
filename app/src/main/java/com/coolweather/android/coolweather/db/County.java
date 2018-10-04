package com.coolweather.android.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * author:Created by YangYong on 2018/10/4.
 * 存放县的信息
 */
public class County extends DataSupport {
    private int id;
    private  String countyName;//记录县的名字
    private String weatherid;//县对应的天气Id
    private int cityId;//记录所属市的Id

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherid(String weatherid) {
        this.weatherid = weatherid;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeatherid() {
        return weatherid;
    }

    public int getCityId() {
        return cityId;
    }


}
