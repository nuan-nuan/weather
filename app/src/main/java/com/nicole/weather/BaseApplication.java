package com.nicole.weather;

import android.app.Application;
import android.content.Context;

import com.nicole.weather.retrofit.RetrofitNet;

/**
 * Created by kevin .
 */
public class BaseApplication extends Application {
    public static Context mAppContext = null;
    @Override
    public void onCreate() {
        super.onCreate();
        mAppContext=getApplicationContext();
        RetrofitNet.initRetrofitNet(getApplicationContext());
    }
}
