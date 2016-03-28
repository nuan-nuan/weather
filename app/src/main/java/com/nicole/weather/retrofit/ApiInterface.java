package com.nicole.weather.retrofit;

import com.nicole.weather.modle.WeatherAPI;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by kevin .
 */
public interface ApiInterface {

    @GET("weather")
    Call<WeatherAPI> mWeatherApi(@Query("city") String city, @Query("key") String key);

}
