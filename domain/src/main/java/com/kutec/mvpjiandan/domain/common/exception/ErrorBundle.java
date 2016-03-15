package com.kutec.mvpjiandan.domain.common.exception;

/**
 * Created by Administrator on 2016/3/14.
 */
public interface ErrorBundle {
    Exception getException();

    String getErrorMessage();
}
