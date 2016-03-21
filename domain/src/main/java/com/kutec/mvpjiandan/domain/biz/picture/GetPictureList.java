package com.kutec.mvpjiandan.domain.biz.picture;

import com.kutec.mvpjiandan.domain.common.executor.PostExecutionThread;
import com.kutec.mvpjiandan.domain.common.executor.ThreadExecutor;
import com.kutec.mvpjiandan.domain.common.interactor.UseCase;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by Administrator on 2016/3/18.
 */
public final class GetPictureList extends UseCase {

    private final int page;
    private final PictureRepository pictureRepository;

    @Inject
    public GetPictureList(ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread, int page, PictureRepository pictureRepository) {
        super(threadExecutor, postExecutionThread);
        this.page = page;
        this.pictureRepository = pictureRepository;
    }

    @Override
    protected Observable buildUseCaseObservable() {
        return pictureRepository.getPictureList(page);
    }
}
