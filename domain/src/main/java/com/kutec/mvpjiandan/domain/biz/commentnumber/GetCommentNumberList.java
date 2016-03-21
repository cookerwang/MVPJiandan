package com.kutec.mvpjiandan.domain.biz.commentnumber;

import com.kutec.mvpjiandan.domain.common.executor.PostExecutionThread;
import com.kutec.mvpjiandan.domain.common.executor.ThreadExecutor;
import com.kutec.mvpjiandan.domain.common.interactor.UseCase;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by Administrator on 2016/3/18.
 */
public final class GetCommentNumberList extends UseCase {

    private final String comments;
    private final CommentNumberRepository commentNumberRepository;

    @Inject
    public GetCommentNumberList(ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread, String comments, CommentNumberRepository commentNumberRepository) {
        super(threadExecutor, postExecutionThread);
        this.comments = comments;
        this.commentNumberRepository = commentNumberRepository;
    }

    @Override
    protected Observable buildUseCaseObservable() {
        return commentNumberRepository.getCommentNumberList(comments);
    }
}
