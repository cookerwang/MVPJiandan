package com.kutec.mvpjiandan.domain.biz.freshnews;

import com.kutec.mvpjiandan.domain.common.executor.PostExecutionThread;
import com.kutec.mvpjiandan.domain.common.executor.ThreadExecutor;
import com.kutec.mvpjiandan.domain.common.interactor.UseCase;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by Administrator on 2016/3/17.
 */

public final class GetFreshNewsList extends UseCase {

    private final FreshNewsRepository freshNewsRepository;
    private final int page;

    @Inject
    public GetFreshNewsList(ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread, FreshNewsRepository freshNewsRepository, int page) {
        super(threadExecutor, postExecutionThread);
        this.freshNewsRepository = freshNewsRepository;
        this.page = page;
    }

    @Override
    protected Observable buildUseCaseObservable() {
        return freshNewsRepository.getFreshNewsList(page);
    }
}
