package com.coolweather.android.coolweather.db;

/**
 * author:Created by YangYong on 2018/10/4.
 * 存放市的信息
 */
public class City {

    private int id;
    private  String cityName;//记录市的名字
    private int cityCode;//记录市的代号
    private int provinceId;//记录当前市所属省的Id

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getId() {

        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }
}
