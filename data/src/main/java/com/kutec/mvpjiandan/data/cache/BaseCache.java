package com.kutec.mvpjiandan.data.cache;

import com.kutec.mvpjiandan.data.db.DatabaseManager;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/3/21.
 */
public abstract class BaseCache<T> {

    public static final String DB_NAME = "jiandan-db";

    private final DatabaseManager databaseManager;

    public BaseCache(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public abstract void clearAllCache();

    public abstract ArrayList<T> getCacheByPage(final int page);

    public abstract void addResultCache(String result, int page);
}
