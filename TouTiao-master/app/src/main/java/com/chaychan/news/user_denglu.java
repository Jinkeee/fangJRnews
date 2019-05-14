package com.chaychan.news;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.chaychan.news.ui.fragment.denglu_Activity;

public class user_denglu extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_mine);
        View v = (View) findViewById(R.id.ll_top) ;
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_denglu.this,denglu_Activity.class);
                startActivity(intent);
            }
        });


    }
}
