package com.hx.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 村/县/乡
 */
public class County extends DataSupport {
    private int id;//主键
    private String countyName;//县名
    private int cityId;//父城市id
    private String weatherId;//天气id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCityeId() {
        return cityId;
    }

    public void setCityeId(int cityeId) {
        this.cityId = cityeId;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
