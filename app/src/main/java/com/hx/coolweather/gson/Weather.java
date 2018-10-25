package com.hx.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public String status;//状态
    public Basic basic;//基本信息
    public AQI aqi;//空气质量
    public Now now;//当前天气
    public Suggestion suggestion;//建议
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}

