package com.skyblue.zanplayer.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2017/10/9 0009.
 */

public class MyFragmentPageAdapter extends FragmentPagerAdapter {
    private List<?> mFragment;
    public MyFragmentPageAdapter(FragmentManager fm, List<?> fragments){
        super(fm);
        this.mFragment = fragments;
    }
    @Override
    public Fragment getItem(int position) {
        return (Fragment) mFragment.get(position);
    }

    @Override
    public int getCount() {
        return mFragment.size();
    }
}
