package com.chaychan.news.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.chaychan.news.R;

/**
 * @description: TODO
 */

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
//    okhttp
//            Retrofit
//    RxJava
//            ButterKnife
//    Gson
//
//    BottomBarLayout(轻量级底部导航栏)
//    BaseRecyclerViewAdapterHelper(ReclerView万能适配器)
//    StateView(用于几种状态布局的切换)
//    JieCaoVideoPlayer(视频播放)
//BGARefreshLayout-Android(下拉刷新)
//        Eyes(修改状态栏颜色)
//        ColorTrackTabLayout
//
//        EventBus用于Android的事件发布简化了应用程序内各个组件之间进行通信的复杂度，尤其是碎片之间进行通信的问题，可以避免由于使用广播通信而带来的诸多不便。
//        KLog(log管理)