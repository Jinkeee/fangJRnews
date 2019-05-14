package com.chaychan.news.model.entity;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobFile;

public class User extends BmobUser {

    private String nicheng;

    public void setNicheng(String nicheng) {
        this.nicheng = nicheng;
    }

    public String getNicheng() {
        return nicheng;
    }
}
