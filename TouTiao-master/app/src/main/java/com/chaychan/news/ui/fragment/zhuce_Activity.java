package com.chaychan.news.ui.fragment;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.chaychan.news.R;
import com.chaychan.news.model.entity.User;

import java.io.File;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobFile;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UploadFileListener;

public class zhuce_Activity extends AppCompatActivity  {


    EditText etUsername,etPassword,etNicheng,etEmail;
    Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhuce_);

        // 获取界面中的相关View
        etUsername = (EditText) findViewById(R.id.et_username);
        etPassword = (EditText) findViewById(R.id.et_password);
        etNicheng = (EditText) findViewById(R.id.et_nicheng);
        btnSignUp = (Button) findViewById(R.id.register);
        // 设置登录按钮点击事件
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user = new User();
                user.setUsername(etUsername.getText().toString());
                user.setPassword(etPassword.getText().toString());
                user.setNicheng(etNicheng.getText().toString());
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                //String icheng = etNicheng.getText().toString();
                // 非空验证
                if(TextUtils.isEmpty(username) || TextUtils.isEmpty(password)){
                    Toast.makeText(zhuce_Activity.this, "用户名或密码不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }

                user.signUp(new SaveListener<User>() {

                    @Override
                    public void done(User user, BmobException e) {
                        if (e == null)
                        {
                            Toast.makeText(zhuce_Activity.this,"注册成功",Toast.LENGTH_SHORT).show();
                        }else
                        {
                            Log.e("注册失败","原因",e);
                        }
                    }
                });
            }
        });
    }




}
