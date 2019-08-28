package com.thomas.dafy.volley.http;

/**
 *  成功和失败的回调
 */

public interface IDataListener<T> {
    void onSuccess(T t);
    void onError(Exception e);
}
