package com.kutec.mvpjiandan.data.db;

import android.content.Context;

import com.kutec.mvpjiandan.data.cache.BaseCache;
import com.socks.greendao.DaoMaster;
import com.socks.greendao.DaoSession;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Administrator on 2016/3/21.
 */
@Singleton
public class DatabaseManager {
    private final Context context;
    private DaoMaster daoMaster;
    private DaoSession daoSession;

    @Inject
    public DatabaseManager(Context context) {
        this.context = context;
    }

    public DaoMaster getDaoMaster() {
        if (daoMaster == null) {
            DaoMaster.OpenHelper helper = new DaoMaster.DevOpenHelper(context, BaseCache.DB_NAME, null);
            daoMaster = new DaoMaster(helper.getWritableDatabase());
        }
        return daoMaster;
    }

    public DaoSession getDaoSession() {
        if (daoSession == null) {
            if (daoMaster == null) {
                daoMaster = getDaoMaster();
            }
            daoSession = daoMaster.newSession();
        }
        return daoSession;
    }
}
