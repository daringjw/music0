package com.jkkc.mymusic;

import android.app.Application;
import android.content.Context;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;

import com.bilibili.magicasakura.utils.ThemeUtils;

/**
 * Created by Guan on 2018/3/8.
 */

public class MusicApplication extends Application implements ThemeUtils.switchColor{
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

        //init
        ThemeUtils.setSwitchColor(this);

    }

    @Override
    public int replaceColorById(Context context, @ColorRes int colorId) {



        return 0;
    }

    @Override
    public int replaceColor(Context context, @ColorInt int color) {


        return 0;

    }
}
