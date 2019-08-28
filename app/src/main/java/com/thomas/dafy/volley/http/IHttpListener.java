package com.thomas.dafy.volley.http;

import java.io.InputStream;

/**
 *  封装响应
 */

interface IHttpListener {
    void onSuccess(InputStream is);
    void onError(Exception e);
}
