package com.skyblue.zanplayer.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;

import com.skyblue.zanplayer.R;
import com.skyblue.zanplayer.base.BaseFragment;
import com.skyblue.zanplayer.databinding.FragmentMusicBinding;
import com.skyblue.zanplayer.model.Constant;
import com.skyblue.zanplayer.utils.GlideImageLoader;

import java.util.ArrayList;


/**
 * Created by caoxiaoliang on 2017/10/9 0009.
 */

public class MusicFragment extends BaseFragment<FragmentMusicBinding> {

   private ArrayList<String> mBannerImages;
    @Override
    public int setContent() {
        return R.layout.fragment_music;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        showBannerPicture();

    }

    protected void showBannerPicture() {
        mBannerImages = new ArrayList<>();
        mBannerImages.add(Constant.bannerUrl1);
        mBannerImages.add(Constant.bannerUrl2);
        mBannerImages.add(Constant.bannerUrl3);
        mBannerImages.add(Constant.bannerUrl4);
        mBindingView.banner.setImages(mBannerImages).setImageLoader(new GlideImageLoader()).start();
    }

}
