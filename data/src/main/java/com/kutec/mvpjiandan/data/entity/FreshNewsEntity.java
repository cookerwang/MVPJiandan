package com.kutec.mvpjiandan.data.entity;


import java.util.List;

/**
 * Created by Administrator on 2016/3/18.
 */
public class FreshNewsEntity {
    public int id;
    public String url;
    public String title;
    public String date; // "2016-03-21 15:22:02"
    public List<Tag> tags;

    public int comment_count;

    public List<CustomField> custom_fields;

    public static class CustomField {
        public String thumb_c;
    }


    public static class Author {
        public int id;
        public String slug;
        public String name;
        public String first_name;
        public String last_name;
        public String nickname;
        public String url;
        public String description;

    }

    public static class Tag {
        public int id;
        public String slug;
        public String title;
        public String description;
        public int post_count;
    }
}
