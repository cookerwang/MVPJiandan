package com.kutec.mvpjiandan.domain.biz.commentator;

import java.util.ArrayList;
import java.util.Map;

import rx.Observable;

/**
 * Created by Administrator on 2016/3/18.
 */
public interface CommentRepository {

    Observable<Boolean> pushComment4DuoShuo(Map<String, String> params);

    Observable<Boolean> pushComment4FreshNews(String url);

    Observable<ArrayList<Comment4FreshNews>> getCommentator4FreshNews(final String thread_key);

    Observable<ArrayList<Commentator>> getCommentator(final String thread_key);

}
