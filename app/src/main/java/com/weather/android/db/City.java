package com.weather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/3/25/025.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceID;
    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id=id;
    }
    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName=cityName;
    }
    public int getCityCode() {
        return cityCode;
    }
    public void setCitycode(int cityCode) {
        this.cityCode=cityCode;
    }
    public int getProvinceID() {
        return provinceID;
    }
    public void setProvinceID(int provinceID) {
        this.provinceID=provinceID;
    }
}
