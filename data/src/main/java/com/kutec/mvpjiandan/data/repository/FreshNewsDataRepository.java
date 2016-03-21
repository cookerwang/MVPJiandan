package com.kutec.mvpjiandan.data.repository;

import com.kutec.mvpjiandan.data.entity.mapper.FreshNewsEntityMapper;
import com.kutec.mvpjiandan.data.repository.datasource.freshnews.FreshNewsDataStore;
import com.kutec.mvpjiandan.data.repository.datasource.freshnews.FreshNewsDataStoreFactory;
import com.kutec.mvpjiandan.domain.biz.freshnews.FreshNews;
import com.kutec.mvpjiandan.domain.biz.freshnews.FreshNewsRepository;

import com.kutec.mvpjiandan.data.repository.datasource.freshnews.CloudFreshNewsDataStore;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Observable;

/**
 * Created by Administrator on 2016/3/21.
 */
@Singleton
public class FreshNewsDataRepository implements FreshNewsRepository {

    private final FreshNewsEntityMapper freshNewsEntityMapper;
    private final FreshNewsDataStoreFactory freshNewsDataStoreFactory;

    @Inject
    public FreshNewsDataRepository(FreshNewsEntityMapper freshNewsEntityMapper, FreshNewsDataStoreFactory freshNewsDataStoreFactory) {
        this.freshNewsEntityMapper = freshNewsEntityMapper;
        this.freshNewsDataStoreFactory = freshNewsDataStoreFactory;
    }

    @Override
    public Observable<List<FreshNews>> getFreshNewsList(final int page) {
        final FreshNewsDataStore freshNewsDataStore = freshNewsDataStoreFactory.create();
        return freshNewsDataStore.freshNewsList(page)
                .map( freshNewsEntities -> freshNewsEntityMapper.transform(freshNewsEntities));
    }

    @Override
    public Observable<String> getFreshNewsDetails(int id) {
        final FreshNewsDataStore freshNewsDataStore = freshNewsDataStoreFactory.create();
        return freshNewsDataStore.freshNewsDetails(id);
    }
}
