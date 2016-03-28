package com.nicole.weather.retrofit;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by kevin .
 */
public class RetrofitNet {

    private static final String TAG = RetrofitNet.class.getSimpleName();

    private static ApiInterface mApiInterface;
    private static ApiInterface getmApiInterface ;
    private static String baseUrl = "https://api.heweather.com/x3/";






    public static ApiInterface getClient() {

        if (getmApiInterface == null) {
            Retrofit client = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            getmApiInterface = client.create(ApiInterface.class);
        }
        return getmApiInterface;
    }

    public static void disposeFailureInfo(Throwable t, Context context, View view) {
        if (t.toString().contains("GaiException") || t.toString().contains("SocketTimeoutException") ||
                t.toString().contains("UnknownHostException")) {
            Snackbar.make(view, "网络不好,~( ´•︵•` )~", Snackbar.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(context, t.getMessage(), Toast.LENGTH_LONG).show();
        }
        Log.w(TAG, t.toString());
    }
}
