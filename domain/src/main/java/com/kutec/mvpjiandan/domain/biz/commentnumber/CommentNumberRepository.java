package com.kutec.mvpjiandan.domain.biz.commentnumber;

import java.util.List;

import rx.Observable;

/**
 * Created by Administrator on 2016/3/18.
 */
public interface CommentNumberRepository {

    Observable<List<CommentNumber>> getCommentNumberList(String comments);
}
