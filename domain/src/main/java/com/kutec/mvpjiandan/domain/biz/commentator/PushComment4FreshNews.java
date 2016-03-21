package com.kutec.mvpjiandan.domain.biz.commentator;

import com.kutec.mvpjiandan.domain.common.executor.PostExecutionThread;
import com.kutec.mvpjiandan.domain.common.executor.ThreadExecutor;
import com.kutec.mvpjiandan.domain.common.interactor.UseCase;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by Administrator on 2016/3/18.
 */
public final class PushComment4FreshNews extends UseCase {

    private final String url;
    private final CommentRepository commentRepository;

    @Inject
    public PushComment4FreshNews(ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread, String url, CommentRepository commentRepository) {
        super(threadExecutor, postExecutionThread);
        this.url = url;
        this.commentRepository = commentRepository;
    }

    @Override
    protected Observable buildUseCaseObservable() {
        return commentRepository.pushComment4FreshNews(url);
    }
}
