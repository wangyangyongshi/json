package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.bean.Student;

import java.util.Map;

/**
 * Created by wangyang on 2019/1/14.
 */
public class StudentController {


    public static void main(String[] args) {
        //拼接json字符串
        Student student = new Student(1, "wangyang");
        String s = JSONObject.toJSONString(student);
        System.out.println(s);

        String ss = "{\"age\":1,\"name\":\"wangyang\"}";
        Student student1 = JSON.parseObject(ss, Student.class);
        System.out.println(student1.getName());


        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "lisi");
        jsonObject.put("age", 1);
        String s1 = jsonObject.toJSONString();
        System.out.println(s1);
        Map map = JSONObject.parseObject(s1, Map.class);
        System.out.println(map.get("name"));



    }
}
