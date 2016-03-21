package com.kutec.mvpjiandan.domain.biz.joke;

/**
 * Created by Administrator on 2016/3/17.
 */
public class Joke {
    public String comment_ID;
    public String comment_post_ID;
    public String comment_author;
    public String comment_author_email;
    public String comment_author_url;
    public String comment_author_IP;
    public String comment_date;
    public String comment_date_gmt;
    public String comment_content;
    public String text_content;
    public String comment_agent;
    public String vote_positive;
    public String vote_negative;
    //评论数量，需要单独获取
    public String comment_counts;
}
