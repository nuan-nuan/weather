package com.nicole.weather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;

import com.nicole.weather.R;
import com.nicole.weather.utils.Config;
import com.nicole.weather.utils.logger.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by kevin .
 * DBManger
 */
public class DBManager {
    private static final String TAG=DBManager.class.getSimpleName();
    private final int BUFFER_SIZES = 400000;
    private static final String DB_NAME = "city.db";
    private static final String APP_NAME = "com.nicole.weather";
    private static final String DB_PATH = "/data" + Environment.getDataDirectory().getAbsolutePath() + "/" + APP_NAME;

    private SQLiteDatabase mDatabase;
    private Context mContext;

    public DBManager(Context context) {
        this.mContext = context;
    }

    public SQLiteDatabase getDatabase() {
        return mDatabase;
    }

    public void openDatabase() {
        this.mDatabase = this.openDatabase(DB_PATH + "/" + DB_NAME);
    }

    public void closeDatabase() {
        this.mDatabase.close();
    }

    private SQLiteDatabase openDatabase(String dbFiles) {
        try {
            if (!(new File(dbFiles).exists())) {
                InputStream inputStream = mContext.getResources().openRawResource(R.raw.city);
                FileOutputStream outputStream = new FileOutputStream(dbFiles);
                byte[] bytes = new byte[BUFFER_SIZES];
                int count = 0;
                while ((count=inputStream.read(bytes))>0){
                    outputStream.write(bytes,0,count);
                }
                outputStream.close();
                inputStream.close();
            }
            SQLiteDatabase database=SQLiteDatabase.openOrCreateDatabase(dbFiles,null);
            return database;
        }catch (FileNotFoundException e){
            Logger.t(Config.TAG).d(TAG,"Database File not found");
            e.printStackTrace();
        }catch (IOException e){
            Logger.t(Config.TAG).d(TAG,"Database IO exception");
            e.printStackTrace();
        }
        return null;
    }
}
