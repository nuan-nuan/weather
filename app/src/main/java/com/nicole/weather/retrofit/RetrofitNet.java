package com.nicole.weather.retrofit;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nicole.weather.utils.Config;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by kevin .
 */
public class RetrofitNet {

    private static final String TAG = RetrofitNet.class.getSimpleName();

    private static ApiInterface mApiInterface;

    private static Retrofit mRetrofit;

    private OkHttpClient mOkHttpClient;

    private Context mContext;

    public static void initRetrofitNet(Context context) {
        Executor executor = Executors.newCachedThreadPool();
        Gson gson = new GsonBuilder().create();
        mRetrofit = new Retrofit.Builder()
                .baseUrl(Config.API_HOST)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .callbackExecutor(executor)
                .build();

        mApiInterface = mRetrofit.create(ApiInterface.class);
    }

    public static ApiInterface getApiService(Context context) {
        if (mApiInterface != null) return mApiInterface;
        initRetrofitNet(context);
        return getApiService(context);
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
