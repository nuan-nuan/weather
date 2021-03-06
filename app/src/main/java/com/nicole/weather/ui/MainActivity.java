package com.nicole.weather.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.nicole.weather.R;
import com.nicole.weather.modle.WeatherAPI;
import com.nicole.weather.retrofit.ApiInterface;
import com.nicole.weather.retrofit.RetrofitNet;
import com.nicole.weather.utils.Config;
import com.nicole.weather.utils.OtherUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity   {

    private static final String TAG = MainActivity.class.getSimpleName();


    public AMapLocationClient mLocationClient = null;
    public AMapLocationClientOption mLocationOption = null;


    private Config mConfig;

    private boolean isLoaction = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConfig = Config.getInstance();
       // location();

        loadDataWithNetWork();

        if (OtherUtils.isNetworkConnected(this)) {
           // location();
            if (isLoaction) {
                onRefresh();
            }
        }


    }

    private void onRefresh() {
        loadDataWithNetWork();
    }

    private void loadDataWithNetWork() {
        String cityName = mConfig.getString(Config.CITY_NAME, "北京");
        ApiInterface apiInterface= RetrofitNet.getClient();
        Call<WeatherAPI> call=apiInterface.mWeatherApi(cityName,Config.HE_API_KEY);
        call.enqueue(new Callback<WeatherAPI>() {
            @Override
            public void onResponse(Call<WeatherAPI> call, Response<WeatherAPI> response) {

            }

            @Override
            public void onFailure(Call<WeatherAPI> call, Throwable t) {

            }

        });


    }

/*    *//**
     * 高德定位
     *//*
    private void location() {
        //初始化定位
        mLocationClient = new AMapLocationClient(getApplicationContext());
        //设置定位回调监听
        mLocationClient.setLocationListener(this);
        mLocationOption = new AMapLocationClientOption();
        //设置定位模式为高精度模式，Battery_Saving为低功耗模式，Device_Sensors是仅设备模式
        mLocationOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Battery_Saving);
        //设置是否返回地址信息（默认返回地址信息）
        mLocationOption.setNeedAddress(true);
        //设置是否只定位一次,默认为false
        mLocationOption.setOnceLocation(false);
        //设置是否强制刷新WIFI，默认为强制刷新
        mLocationOption.setWifiActiveScan(true);
        //设置是否允许模拟位置,默认为false，不允许模拟位置
        mLocationOption.setMockEnable(false);
        //设置定位间隔 单位毫秒
        // mLocationOption.setInterval((mSetting.getInt(Setting.AUTO_UPDATE, 3) * Setting.ONE_HOUR * 1000));
        //给定位客户端对象设置定位参数
        mLocationClient.setLocationOption(mLocationOption);
        //启动定位
        mLocationClient.startLocation();
    }

    @Override
    public void onLocationChanged(AMapLocation aMapLocation) {
        if (aMapLocation != null) {
            if (aMapLocation.getErrorCode() == 0) {
                //定位成功回调信息，设置相关消息
                aMapLocation.getLocationType();//获取当前定位结果来源，如网络定位结果，详见定位类型表
                //aMapLocation.getLatitude();//获取纬度
                //aMapLocation.getLongitude();//获取经度
                //aMapLocation.getAccuracy();//获取精度信息
                //SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                //Date date = new Date(aMapLocation.getTime());
                //df.format(date);//定位时间
                //aMapLocation.getAddress();//地址，如果option中设置isNeedAddress为false，则没有此结果，网络定位结果中会有地址信息，GPS定位不返回地址信息。
                //aMapLocation.getCountry();//国家信息
                //aMapLocation.getProvince();//省信息
                //aMapLocation.getCity();//城市信息
                //aMapLocation.getDistrict();//城区信息
                //aMapLocation.getStreet();//街道信息
                //aMapLocation.getStreetNum();//街道门牌号信息
                //aMapLocation.getCityCode();//城市编码
                //aMapLocation.getAdCode();//地区编码
                mConfig.putString(Config.CITY_NAME, aMapLocation.getCity());
                 isLoaction=true;
                Logger.t(Config.TAG).d(TAG, aMapLocation.getCity());
            } else {
                //显示错误信息ErrCode是错误码，errInfo是错误信息，详见错误码表。
                Logger.t(TAG).d("location Error, ErrCode:" + aMapLocation.getErrorCode() + ", errInfo:" + aMapLocation.getErrorInfo());
            }
        }
    }*/
}
