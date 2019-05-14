package com.chaychan.news.model.response;

import com.chaychan.news.model.entity.CommentData;

import java.util.List;


public class CommentResponse {



    public int total_number;
    public boolean has_more;
    public List<CommentData> data;
}
