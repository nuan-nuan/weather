package com.nicole.weather.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.nicole.weather.R;
import com.nicole.weather.db.DBManager;
import com.nicole.weather.db.WeatherDB;

/**
 * Created by kevin .
 */
public class ChoiceCityActivity extends AppCompatActivity {
    private  DBManager mDBManager;
    private WeatherDB mWeatherDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_city);
        mDBManager = new DBManager(this);
        mDBManager.openDatabase();
        mWeatherDB = new WeatherDB(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mDBManager.closeDatabase();
    }
}
