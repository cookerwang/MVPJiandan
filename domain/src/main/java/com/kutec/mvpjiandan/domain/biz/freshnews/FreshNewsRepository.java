package com.kutec.mvpjiandan.domain.biz.freshnews;

import java.util.List;

import rx.Observable;

/**
 * Created by Administrator on 2016/3/17.
 */
public interface FreshNewsRepository {

    Observable<List<FreshNews>> getFreshNewsList(final int page);

    Observable<String> getFreshNewsDetails(final int id);
}
