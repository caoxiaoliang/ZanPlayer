package com.skyblue.zanplayer.utils;


import android.view.View;

import java.util.Calendar;

/**
 * Created by caoxiaoliang on 2017/10/14 0014.
 * email:cxlchina@foxmail.com
 */

public abstract class PerfectcClickListener implements View.OnClickListener {
    public static final  int MIN_CLICK_DELAY_TIME = 1000;
    private long mLastClickTime = 0;
    private int mId = -1;
    @Override
    public void onClick(View view) {
        long currentTime = Calendar.getInstance().getTimeInMillis();
        int id = view.getId();
        if(mId!=id){
            mId = id;
            mLastClickTime = currentTime;
            onNoDoubleClick(view);
            return;
        }
        if(currentTime-mLastClickTime>MIN_CLICK_DELAY_TIME){
            mLastClickTime = currentTime;
            onNoDoubleClick(view);
        }
    }

    protected abstract void onNoDoubleClick(View v);
}
