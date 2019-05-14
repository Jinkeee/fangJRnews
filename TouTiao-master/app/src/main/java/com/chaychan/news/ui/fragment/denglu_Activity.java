package com.chaychan.news.ui.fragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.chaychan.news.R;
import com.chaychan.news.model.entity.User;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

import static com.google.common.reflect.Reflection.initialize;

public class denglu_Activity extends AppCompatActivity implements View.OnClickListener{


    private EditText etusername;
    private EditText etpassword;
    private Button login;
    private Button sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denglu_);
        Bmob.initialize(this, "fbf3514decb00037fc3a1d8c10301453");
        initialize();
        initView();
        etusername = (EditText) findViewById(R.id.et_username);
        etpassword = (EditText) findViewById(R.id.et_password);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BmobUser userlogin = new BmobUser();
                userlogin.setUsername(etpassword.getText().toString());
                userlogin.setPassword(etpassword.getText().toString());
                userlogin.login(new SaveListener<BmobUser>() {

                    @Override
                    public void done(BmobUser bmobUser, BmobException e) {
                        if (e == null)
                        {
                            Toast.makeText(denglu_Activity.this,bmobUser.getUsername()+"登陆成功",Toast.LENGTH_SHORT).show();
                        }else {
                            Log.e("登录失败","原因",e);
                        }
                    }
                });
            }
        });
    }


    private void initView() {
    }
    private void initialize() {

        etusername = (EditText) findViewById(R.id.et_username);
        etpassword = (EditText) findViewById(R.id.et_password);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(this);
        sign = (Button) findViewById(R.id.sign);
        sign.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login:
                final String username = etusername.getText().toString();
                String password = etpassword.getText().toString();

                if (!TextUtils.isEmpty(username) && !TextUtils.isEmpty(password)){
                    final BmobUser bmobUser = new BmobUser();
                    bmobUser.setUsername(username);
                    bmobUser.setPassword(password);
                    bmobUser.saveObservable();
//                    bmobUser.login(denglu_Activity.this,new  )


                }
                break;
            case R.id.sign:
                Intent intent = new Intent(this,zhuce_Activity.class);
                startActivity(intent);
                break;
        }

    }
}
