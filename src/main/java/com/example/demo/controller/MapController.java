package com.example.demo.controller;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by wangyang on 2019/1/14.
 * http://www.importnew.com/7099.html------------>hashmap工作原理
 */
public class MapController {

    public static void main(String[] args) {
//        Map<String, Object> map = new HashMap();
//        map.put(null, null);
//        map.put("name", "zhangqiang");
//        map.put("name","wangyang");
//        map.put("age", 22);
////        map.remove("name");
//        Set set = map.entrySet();
//        Set set1 = map.keySet();
//
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {
//            Map.Entry entry = (Map.Entry) iterator.next();
//            iterator.remove();
//            Object key = entry.getKey();
//            Object value = entry.getValue();
//            System.out.println(key + "============" + value);
//
//        }
//        System.out.println("=========for循环遍历===============");
//        for (Object entry : map.entrySet()) {
//            Map.Entry entry1 = (Map.Entry) entry;
//            Object key = entry1.getKey();
//            Object value = ((Map.Entry) entry).getValue();
//            System.out.println(key + "++++++++" + value);
//        }

        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("张三", 22);
        map.put("李四", 25);
        map.put("王五", 33);
        map.put("赵六", 28);
        map.put("田七", 25);
        map.put("李思", 25);
        map.put("李嘉欣", 25);

//        map.remove("李嘉欣");
//
//        for (String s : map.keySet()) {
//            System.out.println("key:"+s+",value:"+map.get(s));
//        }
//
        Set<Map.Entry<String, Integer>> set = map.entrySet();
//        for (Map.Entry<String, Integer> stringIntegerEntry : set) {
//            System.out.println(stringIntegerEntry);
//        }
//
        for (Map.Entry<String, Integer> entry : set) {
            String name = entry.getKey();
            System.out.println(name);
            System.out.println(name.contains("李"));
            if (name.contains("李")) {
                map.remove(name);
            }
        }
    }

}
