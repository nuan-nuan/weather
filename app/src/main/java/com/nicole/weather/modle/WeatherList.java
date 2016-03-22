package com.nicole.weather.modle;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin .
 */
public class WeatherList {
    @SerializedName("HeWeather data service 3.0")
    @Expose
    public List<WeatherEntity> mHeWeatherDataService30s = new ArrayList<>();
}
