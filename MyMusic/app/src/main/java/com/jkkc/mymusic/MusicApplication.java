package com.jkkc.mymusic;

import android.app.Application;

/**
 * Created by Guan on 2018/3/8.
 */

public class MusicApplication extends Application {
    /***
     * 单例模式
     */

    private static MusicApplication instance;

    public static MusicApplication getInstance() {
        return instance;
    }
    @Override
    public void onCreate() {
        super.onCreate();

    }
}
