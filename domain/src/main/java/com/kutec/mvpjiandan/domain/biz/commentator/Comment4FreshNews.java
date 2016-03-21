package com.kutec.mvpjiandan.domain.biz.commentator;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/3/18.
 */
public class Comment4FreshNews {
    public int id;
    public String url;
    public String date;
    public String content;
    public String parent;
    public int parentId;
    public ArrayList<Comment4FreshNews> parentComments;
    public int vote_positive;
}
