package com.kutec.mvpjiandan.domain.biz.picture;

/**
 * Created by Administrator on 2016/3/17.
 */
public class Picture {
    public String comment_ID;
    public String comment_author;
    public String comment_date;
    public String text_content;
    public String vote_positive;
    public String vote_negative;
    public String[] pics;
    //评论数量，需要单独获取
    public String comment_counts;
}
