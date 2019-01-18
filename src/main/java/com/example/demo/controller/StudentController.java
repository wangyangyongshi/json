package com.example.demo.controller;

import com.example.demo.bean.Student;

import java.io.*;

/**
 * Created by wangyang on 2019/1/14.
 */
public class StudentController {


    public static void main(String[] args) {
        //拼接json字符串
//        Student student = new Student(1, "wangyang");
//        String s = JSONObject.toJSONString(student);
//        System.out.println(s);
//
//        String ss = "{\"age\":1,\"name\":\"wangyang\"}";
//        Student student1 = JSON.parseObject(ss, Student.class);
//        System.out.println(student1.getName());
//
//
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("name", "lisi");
//        jsonObject.put("age", 1);
//        String s1 = jsonObject.toJSONString();
//        System.out.println(s1);
//        Map map = JSONObject.parseObject(s1, Map.class);
//        System.out.println(map.get("name"));

        //通过反射去创建一个对象

//            wang = Student.class.newInstance();
        Student wang = new Student(100, "77878");


        //采用序列化机制
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.obj"));
            out.writeObject(wang);
            out.close();
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"))) {
                try {
                    Student yang = (Student) in.readObject();
                    System.out.println(yang);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//            Class<?> name = Class.forName("com.example.demo.bean.Student");
//            Object o = name.newInstance();
//        try {
//            Constructor<Student> constructor = null;
//            constructor = Student.class.getConstructor(int.class, String.class);
//            wang = (Student) constructor.newInstance(100, "yanqing");
//            System.out.println(wang.toString());
//            yang = (Student) wang.clone();
//            System.out.println(yang.toString());
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//    }


