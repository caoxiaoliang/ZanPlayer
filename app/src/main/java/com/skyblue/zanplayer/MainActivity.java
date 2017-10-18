package com.skyblue.zanplayer;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.jaeger.library.StatusBarUtil;
import com.skyblue.zanplayer.adapter.MyFragmentPageAdapter;
import com.skyblue.zanplayer.databinding.ActivityMainBinding;
import com.skyblue.zanplayer.fragment.MeFragment;
import com.skyblue.zanplayer.fragment.MusicFragment;
import com.skyblue.zanplayer.fragment.VideoFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,View.OnClickListener, ViewPager.OnPageChangeListener {

    private ActivityMainBinding mActivityMainBinding;
    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;
    private Toolbar mToolbar;
    private FrameLayout mTitleMenu;

    private TextView mTitleMusic;
    private TextView mTitleVideo;
    private TextView mTitleMe;

    private ViewPager mVpContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityMainBinding = DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        initContentViewId();
        initDrawLayout();
        initNavigationView();
        initListener();
        initContentFragment();
    }

    private void initListener() {
        mTitleMenu.setOnClickListener(this);
        mTitleMusic.setOnClickListener(this);
        mTitleVideo.setOnClickListener(this);
        mTitleMe.setOnClickListener(this);
    }
    private void initContentViewId(){
        mDrawerLayout = mActivityMainBinding.drawerLayout;
        mToolbar = mActivityMainBinding.contentView.toolbar;
        mNavigationView = mActivityMainBinding.navView;
        mTitleMenu  = mActivityMainBinding.contentView.llTitleMenu;
        mTitleMusic = mActivityMainBinding.contentView.ivTitleMusic;
        mTitleVideo = mActivityMainBinding.contentView.ivTitleVideo;
        mTitleMe = mActivityMainBinding.contentView.ivTitleMe;
        mVpContent = mActivityMainBinding.contentView.vpContent;
    }
    private void initNavigationView(){
        mNavigationView.setNavigationItemSelectedListener(this);
    }
    private void initDrawLayout(){
        StatusBarUtil.setColorNoTranslucentForDrawerLayout(MainActivity.this, mDrawerLayout, ContextCompat.getColor(this,R.color.colorTheme));
        setSupportActionBar(mToolbar);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
             actionBar.setDisplayShowTitleEnabled(false);
        }
    }
    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    public void initContentFragment() {
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new MusicFragment());
        fragments.add(new VideoFragment());
        fragments.add(new MeFragment());
        MyFragmentPageAdapter adapter = new MyFragmentPageAdapter(getSupportFragmentManager(),fragments);
        mVpContent.setAdapter(adapter);
        mVpContent.addOnPageChangeListener(this);
        mVpContent.setCurrentItem(0);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_search) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ll_title_menu:
                mDrawerLayout.openDrawer(GravityCompat.START);
                break;
            case R.id.iv_title_music:
                mTitleMusic.setTextColor(ContextCompat.getColor(this,R.color.colorWhite));
                mTitleVideo.setTextColor(ContextCompat.getColor(this,R.color.colorPageBg));
                mTitleMe.setTextColor(ContextCompat.getColor(this,R.color.colorPageBg));
                mVpContent.setCurrentItem(0);
                break;
            case R.id.iv_title_video:
                mTitleMusic.setTextColor(ContextCompat.getColor(this,R.color.colorPageBg));
                mTitleVideo.setTextColor(ContextCompat.getColor(this,R.color.colorWhite));
                mTitleMe.setTextColor(ContextCompat.getColor(this,R.color.colorPageBg));
                mVpContent.setCurrentItem(1);
                break;
            case R.id.iv_title_me:
                mTitleMusic.setTextColor(ContextCompat.getColor(this,R.color.colorPageBg));
                mTitleVideo.setTextColor(ContextCompat.getColor(this,R.color.colorPageBg));
                mTitleMe.setTextColor(ContextCompat.getColor(this,R.color.colorWhite));
                mVpContent.setCurrentItem(2);
                break;
            default:
                break;
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_camera) {

        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        switch (position){
            case 0:
                mTitleMusic.setTextColor(ContextCompat.getColor(this,R.color.colorWhite));
                mTitleVideo.setTextColor(ContextCompat.getColor(this,R.color.colorPageBg));
                mTitleMe.setTextColor(ContextCompat.getColor(this,R.color.colorPageBg));
                mVpContent.setCurrentItem(0);
                break;
            case 1:
                mTitleMusic.setTextColor(ContextCompat.getColor(this,R.color.colorPageBg));
                mTitleVideo.setTextColor(ContextCompat.getColor(this,R.color.colorWhite));
                mTitleMe.setTextColor(ContextCompat.getColor(this,R.color.colorPageBg));
                mVpContent.setCurrentItem(1);
                break;
            case 2:
                mTitleMusic.setTextColor(ContextCompat.getColor(this,R.color.colorPageBg));
                mTitleVideo.setTextColor(ContextCompat.getColor(this,R.color.colorPageBg));
                mTitleMe.setTextColor(ContextCompat.getColor(this,R.color.colorWhite));
                mVpContent.setCurrentItem(2);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
