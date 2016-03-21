package com.kutec.mvpjiandan.domain.biz.joke;

import com.kutec.mvpjiandan.domain.common.executor.PostExecutionThread;
import com.kutec.mvpjiandan.domain.common.executor.ThreadExecutor;
import com.kutec.mvpjiandan.domain.common.interactor.UseCase;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by Administrator on 2016/3/18.
 */
public final class GetJokeList extends UseCase {

    private final int page;
    private final JokesRepository jokesRepository;

    @Inject
    public GetJokeList(ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread, int page, JokesRepository jokesRepository) {
        super(threadExecutor, postExecutionThread);
        this.page = page;
        this.jokesRepository = jokesRepository;
    }

    @Override
    protected Observable buildUseCaseObservable() {
        return jokesRepository.getJokes(page);
    }
}
