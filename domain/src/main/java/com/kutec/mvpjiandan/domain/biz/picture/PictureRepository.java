package com.kutec.mvpjiandan.domain.biz.picture;

import rx.Observable;

/**
 * Created by Administrator on 2016/3/18.
 */
public interface PictureRepository {

    Observable<Picture> getPictureList(final int page);

}
