package com.hx.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 村/县/乡
 */
public class County extends DataSupport {
    private int id;
    private String countyName;
    private int cityId;
    private int weatherId;

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

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }
}
