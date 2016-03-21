package com.kutec.mvpjiandan.domain.biz.video;

import com.kutec.mvpjiandan.domain.common.executor.PostExecutionThread;
import com.kutec.mvpjiandan.domain.common.executor.ThreadExecutor;
import com.kutec.mvpjiandan.domain.common.interactor.UseCase;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by Administrator on 2016/3/18.
 */
public final class GetVideoList extends UseCase {

    private final int page;
    private final VideoRepository videoRepository;

    @Inject
    public GetVideoList(ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread, int page, VideoRepository videoRepository) {
        super(threadExecutor, postExecutionThread);
        this.page = page;
        this.videoRepository = videoRepository;
    }

    @Override
    protected Observable buildUseCaseObservable() {
        return videoRepository.getVideos(page);
    }
}
