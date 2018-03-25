package com.weather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/3/25/025.
 */

public class County extends DataSupport{
    private int id;
    private String countyName;
    private String weatherID;
    private int cityID;

    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id=id;
    }
    public String getCountyName() {
        return countyName;
    }
    public void setCountyName(String countyName) {
        this.countyName=countyName;
    }
    public String getWeatherID() {
        return weatherID;
    }
    public void setWeatherID(String weatherID) {
        this.weatherID=weatherID;
    }
    public int getCityID() {
        return cityID;
    }
    public void setCityID(int cityID){
        this.cityID=cityID;
    }
}
