package com.kutec.mvpjiandan.data.repository.datasource.freshnews;

import com.kutec.mvpjiandan.data.entity.FreshNewsEntity;


import java.util.List;

import rx.Observable;

/**
 * Created by Administrator on 2016/3/21.
 */
public interface FreshNewsDataStore {

    Observable<List<FreshNewsEntity>> freshNewsList(final int page);

    Observable<String> freshNewsDetails(final int id);
}
