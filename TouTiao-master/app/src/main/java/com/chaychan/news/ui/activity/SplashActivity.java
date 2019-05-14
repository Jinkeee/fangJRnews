package com.chaychan.news.ui.activity;

import android.content.Intent;

import com.chaychan.news.R;
import com.chaychan.news.base.BaseActivity;
import com.chaychan.news.base.BasePresenter;
import com.chaychan.news.utils.UIUtils;

import com.chaychan.uikit.statusbar.Eyes;

/**
 * @description: 闪屏页
 */

public class SplashActivity extends BaseActivity {

    @Override
    protected BasePresenter createPresenter() {
        return null;
    }

    @Override
    public boolean enableSlideClose() {
        return false;
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_splash;
    }

    @Override
    public void initView() {
        Eyes.translucentStatusBar(this,false);//
        UIUtils.postTaskDelay(new Runnable() {
            @Override
            public void run() {
                 startActivity(new Intent(SplashActivity.this,MainActivity.class));
                finish();
            }
        },2000);
    }
}
