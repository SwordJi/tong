package com.elong.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonUtils {


    /**
     * 实体类转json(显示null值)
     * @param bean 实体类对象
     * @return json字符串
     */
    public static String beanToJson(Object bean) {
        Gson gson = new GsonBuilder().serializeNulls().create();
        return gson.toJson(bean);
    }



}
