package com.nicole.weather;

import android.app.Application;
import android.content.Context;

import com.orhanobut.logger.*;
import com.orhanobut.logger.BuildConfig;

/**
 * Created by kevin .
 */
public class BaseApplication extends Application {
    public static Context mAppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppContext = getApplicationContext();
        Logger.init("Kevin")
                .methodCount(2)
                .methodOffset(2)
                .hideThreadInfo()
                .logLevel(BuildConfig.DEBUG ? LogLevel.FULL : LogLevel.NONE);
    }

    public static Context getContext() {
        return mAppContext;
    }
}
