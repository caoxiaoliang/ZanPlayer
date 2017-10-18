package com.skyblue.zanplayer.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.skyblue.zanplayer.R;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Administrator on 2017/10/11 0011.
 */

public abstract class BaseFragment<TV extends ViewDataBinding> extends Fragment {
    //布局view
    protected TV mBindingView;
    //内存布局
    private RelativeLayout mRlContainer;
    private CompositeSubscription mCompositeSubscription;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View ll = inflater.inflate(R.layout.fragment_base,null);
        mBindingView = DataBindingUtil.inflate(getActivity().getLayoutInflater(),setContent(),null,false);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT);
        mBindingView.getRoot().setLayoutParams(params);
        mRlContainer = ll.findViewById(R.id.container);
        mRlContainer.addView(mBindingView.getRoot());
        return ll;
    }

    protected void loadData(){
    }

    protected void onRefresh(){
    }

    public abstract int setContent();

    public void addSubscription(Subscription s) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeSubscription();
        }
        mCompositeSubscription.add(s);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mCompositeSubscription != null && mCompositeSubscription.hasSubscriptions()) {
            mCompositeSubscription.unsubscribe();
        }
    }

    public void removeSubscription(){
        if (mCompositeSubscription != null && mCompositeSubscription.hasSubscriptions()) {
            mCompositeSubscription.unsubscribe();
        }
    }
}
