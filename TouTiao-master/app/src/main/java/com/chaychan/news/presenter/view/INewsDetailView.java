package com.chaychan.news.presenter.view;

import com.chaychan.news.model.response.CommentResponse;
import com.chaychan.news.model.entity.NewsDetail;

/**
 * @description: 新闻详情的回调
 */

public interface INewsDetailView {

    void onGetNewsDetailSuccess(NewsDetail newsDetail);

    void onGetCommentSuccess(CommentResponse response);

    void onError();
}
