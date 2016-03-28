package com.kutec.mvpjiandan.data.entity.mapper;

import com.kutec.mvpjiandan.data.entity.FreshNewsEntity;
import com.kutec.mvpjiandan.domain.biz.freshnews.FreshNews;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/3/21.
 */

public class FreshNewsEntityMapper {

    @Inject
    public FreshNewsEntityMapper() {

    }



    public List<FreshNews> transform(List<FreshNewsEntity> freshNewsEntityList) {
        List<FreshNews> freshNewsList = new ArrayList<>();
        if( freshNewsEntityList != null ) {
            FreshNews freshNews;
            for( FreshNewsEntity entity : freshNewsEntityList ) {
                freshNews = new FreshNews();
                freshNews.author;
            }
        }
        return null;
    }
}
