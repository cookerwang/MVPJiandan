package com.kutec.mvpjiandan.domain.biz.commentator;

import com.kutec.mvpjiandan.domain.common.executor.PostExecutionThread;
import com.kutec.mvpjiandan.domain.common.executor.ThreadExecutor;
import com.kutec.mvpjiandan.domain.common.interactor.UseCase;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by Administrator on 2016/3/18.
 */
public final class GetCommentator extends UseCase {

    private final String threadKey;
    private final CommentRepository commentRepository;

    @Inject
    public GetCommentator(ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread, String threadKey, CommentRepository commentRepository) {
        super(threadExecutor, postExecutionThread);
        this.threadKey = threadKey;
        this.commentRepository = commentRepository;
    }

    @Override
    protected Observable buildUseCaseObservable() {
        return commentRepository.getCommentator(threadKey);
    }
}
