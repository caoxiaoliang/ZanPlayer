package com.skyblue.zanplayer.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.skyblue.zanplayer.R;
import com.youth.banner.loader.ImageLoader;

/**
 * Created by caoxiaoliang on 2017/10/16 0016.
 * email:cxlchina@foxmail.com
 */

public class GlideImageLoader extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        Glide.with(context).load(path)
                .placeholder(R.drawable.img_banner_default_)
                .error(R.drawable.img_banner_default_)
                .crossFade(1000)
                .into(imageView);
    }
}
