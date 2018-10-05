package com.hx.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 获取 遍历省市县数据 工具util
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
