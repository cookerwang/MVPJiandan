package com.kutec.mvpjiandan.domain.biz.commentator;

/**
 * Created by Administrator on 2016/3/17.
 */
public class Commentator {

    //评论列表
    public static final String URL_COMMENT_LIST = "http://jandan.duoshuo.com/api/threads/listPosts.json?thread_key=";
    //发表评论
    public static final String URL_PUSH_COMMENT = "http://jandan.duoshuo.com/api/posts/create.json";

    //评论内容标签
    public static final String TAG_HOT = "hot";
    public static final String TAG_NORMAL = "normal";

    //评论布局类型
    public static final int TYPE_HOT = 0;
    public static final int TYPE_NEW = 1;
    public static final int TYPE_NORMAL = 2;

    protected String avatar_url;
    protected String created_at;
    protected String name;
    protected String message;

    //评论发送者id
    protected String post_id;
    //这条评论所回复的评论id
    protected String parent_id;
    //这条评论上的所有评论id
    protected String[] parents;
    //所属楼层
    protected int floorNum = 1;
    //用于标示是否是热门评论
    protected String tag = TAG_NORMAL;
    //用于区别布局类型：热门评论、最新评论、普通评论
    protected int type = TYPE_NORMAL;

}
