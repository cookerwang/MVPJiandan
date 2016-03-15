package com.kutec.mvpjiandan.domain.biz.freshnews;

/**
 * Created by Administrator on 2016/3/14.
 */
public class FreshNews {
    //文章id
    public String id;
    //文章标题
    public String title;
    //文章地址
    public String url;
    //发布日期
    public String date;
    //评论数
    public String comment_count;
    //作者
    public Author author;
    //自定义字段
    public CustomFields custom_fields;
    //标签
    public Tags tags;
}
