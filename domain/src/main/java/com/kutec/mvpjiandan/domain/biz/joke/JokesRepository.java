package com.kutec.mvpjiandan.domain.biz.joke;

import java.util.List;

import rx.Observable;

/**
 * Created by Administrator on 2016/3/18.
 */
public interface JokesRepository {

    Observable<List<Joke>> getJokes(final int page);
}
