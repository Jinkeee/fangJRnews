package com.chaychan.news.ui.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.chaychan.news.R;
import com.chaychan.news.base.BaseFragment;
import com.chaychan.news.base.BasePresenter;
import com.chaychan.news.listener.OnChannelListener;
import com.socks.library.KLog;

import butterknife.OnClick;

/*
 * @description: 我的fragment
 */

public class MineFragment extends BaseFragment {




    @Override
    protected BasePresenter createPresenter() {
        return null;
    }

    @Override
    protected int provideContentViewId() {
        return  R.layout.fragment_mine;
    }

    @Override
    public void initView(View rootView) {
        KLog.i("initView");
    }

    @Override
    public void initData() {
        KLog.i("initData");
    }

    @Override
    public void initListener() {
        KLog.i("initListener");
    }

    @Override
    public void loadData() {
        KLog.i("loadData");
    }



    @OnClick({R.id.ll_top})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_top:
                startActivity(new Intent(getActivity(), denglu_Activity.class));

                break;

        }
    }

}
