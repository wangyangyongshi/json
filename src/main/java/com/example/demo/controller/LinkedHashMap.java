package com.example.demo.controller;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by wangyang on 2019/1/23.
 */
public class LinkedHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new java.util.LinkedHashMap<>(16, 0.75f, true);
        map.put("apple", "苹果");
        map.put("watermelon", "西瓜");
        map.put("banana", "香蕉");
        map.put("peach", "桃子");

        map.get("peach");
        map.get("banana");
        //按照访问 顺序来访问

        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey() + "======" + entry.getValue());
        }

    }
}
