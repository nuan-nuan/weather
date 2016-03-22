package com.nicole.weather.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.nicole.weather.BaseApplication;

/**
 * Created by kevin .
 */
public class Config {
    public static final String TAG="Kevin Logger";
    //和风Api Host
    public static final String API_HOST="https://api.heweather.com/x3/";
    //和风天气Api key
    public static final String HE_API_KEY="e3fd7b0e0e404b16aea02cc8579c2d44";
    //选择城市
    public static final String CITY_NAME = "城市";
    //当前小时
    public static final String HOUR = "小时";

    public static int ONE_HOUR = 3600;

    private static Config sInstance;

    private SharedPreferences mPrefs;
    public static Config getInstance() {
        if (sInstance == null) {
            sInstance = new Config(BaseApplication.mAppContext);
        }
        return sInstance;
    }

    public Config putString(String key, String value) {
        mPrefs.edit().putString(key, value).apply();
        return this;
    }


    public String getString(String key, String defValue) {
        return mPrefs.getString(key, defValue);
    }


    public Config putInt(String key, int value) {
        mPrefs.edit().putInt(key, value).apply();
        return this;
    }


    public int getInt(String key, int defValue) {
        return mPrefs.getInt(key, defValue);
    }

    private Config(Context context) {
        mPrefs = context.getSharedPreferences("setting", Context.MODE_PRIVATE);
        //mPrefs.edit().putInt(CHANGE_ICONS, 1).apply();
    }
}
