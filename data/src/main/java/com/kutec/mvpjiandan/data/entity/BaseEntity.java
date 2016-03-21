package com.kutec.mvpjiandan.data.entity;

/**
 * Created by Administrator on 2016/3/21.
 */
public class BaseEntity<T> {

    public String status; // "ok"
    public int count;
    public int count_total;
    public int pages;

    public T data;
}
