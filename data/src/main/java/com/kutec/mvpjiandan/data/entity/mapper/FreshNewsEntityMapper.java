package com.kutec.mvpjiandan.data.entity.mapper;

import com.kutec.mvpjiandan.data.entity.FreshNewsEntity;
import com.kutec.mvpjiandan.domain.biz.freshnews.FreshNews;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Administrator on 2016/3/21.
 */

public class FreshNewsEntityMapper {

    @Inject
    public FreshNewsEntityMapper() {

    }



    public List<FreshNews> transform(List<FreshNewsEntity> freshNewsEntityList) {
        return null;
    }
}
