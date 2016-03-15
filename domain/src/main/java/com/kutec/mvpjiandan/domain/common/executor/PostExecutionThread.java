package com.kutec.mvpjiandan.domain.common.executor;

import rx.Scheduler;

/**
 * Created by Administrator on 2016/3/14.
 */
public interface PostExecutionThread {
    Scheduler getScheduler();
}
