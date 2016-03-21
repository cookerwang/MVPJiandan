package com.kutec.mvpjiandan.domain.biz.video;

import java.util.List;

import rx.Observable;

/**
 * Created by Administrator on 2016/3/18.
 */
public interface VideoRepository {
    Observable<List<Video>> getVideos(final int page);
}
