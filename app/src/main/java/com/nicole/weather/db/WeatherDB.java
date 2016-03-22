package com.nicole.weather.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.nicole.weather.modle.City;
import com.nicole.weather.modle.Province;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin .
 * 数据库操作
 */
public class WeatherDB {
    private Context mContext;

    public WeatherDB(Context context) {
        this.mContext = context;
    }
    public List<Province> loadProvince(SQLiteDatabase sqLiteDatabase){
        List<Province> provinceList=new ArrayList<>();
        Cursor cursor = sqLiteDatabase.query("T_Province", null, null, null, null, null, null);
        if (cursor.moveToFirst()){
            do {
                Province province=new Province();
                province.ProSort=cursor.getInt(cursor.getColumnIndex("ProSort"));
                province.ProName=cursor.getString(cursor.getColumnIndex("ProName"));
            }while (cursor.moveToNext());
        }
        cursor.close();
        return provinceList;
    }

    public List<City> loadCities(SQLiteDatabase db, int ProID) {
        List<City> list = new ArrayList<>();
        Cursor cursor = db.query("T_City", null, "ProID = ?", new String[] { String.valueOf(ProID) }, null, null, null);
        if (cursor.moveToFirst()) {
            do {
                City city = new City();
                city.CityName = cursor.getString(cursor.getColumnIndex("CityName"));
                city.ProID = ProID;
                list.add(city);

            } while (cursor.moveToNext());
        } cursor.close();

        return list;
    }

}
