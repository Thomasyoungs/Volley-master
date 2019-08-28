package com.thomas.dafy.volley.http;

import com.thomas.dafy.volley.http.IHttpListener;

/**
 *  封装请求
 */

interface IHttpService {
    void setUrl(String url);
    void setRequestData(byte[] requestData);
    void execute();
    void setRequestMethod(int method);

    // 设置两个接口之间的关系
    void setHttpCallBack(IHttpListener httpListener);
}
