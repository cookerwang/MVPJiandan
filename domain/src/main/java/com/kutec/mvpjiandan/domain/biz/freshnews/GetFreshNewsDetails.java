package com.kutec.mvpjiandan.domain.biz.freshnews;

import com.kutec.mvpjiandan.domain.common.executor.PostExecutionThread;
import com.kutec.mvpjiandan.domain.common.executor.ThreadExecutor;
import com.kutec.mvpjiandan.domain.common.interactor.UseCase;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by Administrator on 2016/3/17.
 */
public final class GetFreshNewsDetails extends UseCase {

    private final int id;
    private final FreshNewsRepository freshNewsRepository;

    @Inject
    public GetFreshNewsDetails(ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread, int id, FreshNewsRepository freshNewsRepository) {
        super(threadExecutor, postExecutionThread);
        this.id = id;
        this.freshNewsRepository = freshNewsRepository;
    }

    @Override
    protected Observable buildUseCaseObservable() {
        return freshNewsRepository.getFreshNewsDetails(id);
    }
}
