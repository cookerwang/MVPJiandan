package com.kutec.mvpjiandan.data.cache;

import com.kutec.mvpjiandan.data.db.DatabaseManager;
import com.kutec.mvpjiandan.data.entity.FreshNewsEntity;
import com.kutec.mvpjiandan.data.utils.FreshNewsEntityParser;
import com.socks.greendao.FreshNewsCacheDao;

import java.util.ArrayList;

import javax.inject.Inject;
import javax.inject.Singleton;

import de.greenrobot.dao.query.QueryBuilder;

@Singleton
public class FreshNewsCache extends BaseCache<FreshNewsEntity> {

    private final FreshNewsCacheDao mFreshNewsCacheDao;

    @Inject
    public FreshNewsCache(DatabaseManager databaseManager) {
        super(databaseManager);
        this.mFreshNewsCacheDao = databaseManager.getDaoSession().getFreshNewsCacheDao();
    }

    @Override
    public void clearAllCache() {
        mFreshNewsCacheDao.deleteAll();
    }

    @Override
    public ArrayList<FreshNewsEntity> getCacheByPage(int page) {

        QueryBuilder<com.socks.greendao.FreshNewsCache> query = mFreshNewsCacheDao.queryBuilder()
                .where(FreshNewsCacheDao.Properties.Page.eq("" + page));

        if (query.list().size() > 0) {
            return FreshNewsEntityParser.parseCache(query.list().get(0).getResult());
        } else {
            return new ArrayList<FreshNewsEntity>();
        }
    }

    @Override
    public void addResultCache(String result, int page) {
        com.socks.greendao.FreshNewsCache freshNewsCache = new com.socks.greendao.FreshNewsCache();
        freshNewsCache.setResult(result);
        freshNewsCache.setPage(page);
        freshNewsCache.setTime(System.currentTimeMillis());
        mFreshNewsCacheDao.insert(freshNewsCache);
    }



}