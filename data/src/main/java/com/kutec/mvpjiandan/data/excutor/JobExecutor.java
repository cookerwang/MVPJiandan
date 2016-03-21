package com.kutec.mvpjiandan.data.excutor;

import com.kutec.mvpjiandan.domain.common.executor.ThreadExecutor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Administrator on 2016/3/21.
 */

@Singleton
public class JobExecutor implements ThreadExecutor {


    private static final int CORE_POOL_SIZE = 3;
    private static final int MAX_NUM_POOL_SIZE = 5;
    private static final long KEEP_ALIVE_TIME = 10;
    private static final TimeUnit TIME_UNIT = TimeUnit.SECONDS;
    private final ThreadPoolExecutor threadPoolExecutor;
    private final BlockingQueue<Runnable> workQueue;
    private final ThreadFactory threadFactory;

    @Inject
    public JobExecutor() {
        threadFactory = new JobThreadFactory();
        workQueue = new LinkedBlockingDeque<>();
        threadPoolExecutor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_NUM_POOL_SIZE, KEEP_ALIVE_TIME, TIME_UNIT, workQueue, threadFactory);
    }

    @Override
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new IllegalArgumentException("Runnable to execute cannot be null");
        }
        threadPoolExecutor.execute(runnable);
    }


    private static class JobThreadFactory implements ThreadFactory {

        private final static String name = "andorid_";
        private int count = 0;

        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, name+count++);
        }
    }

}
