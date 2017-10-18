package com.skyblue.zanplayer;

import android.app.Application;

/**
 * Created by Administrator on 2017/9/23 0023.
 */

public class ZanApplication extends Application {
    private static ZanApplication zanApplication;

    public static ZanApplication getInstance() {
        if (zanApplication == null) {
            synchronized (ZanApplication.class) {
                if (zanApplication == null) {
                    zanApplication = new ZanApplication();
                }
            }
        }
        return zanApplication;
    }
}
