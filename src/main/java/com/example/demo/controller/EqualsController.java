package com.example.demo.controller;

import com.example.demo.bean.Student;

/**
 * Created by wangyang on 2019/1/17.
 * java中的四种引用，包括强引用，弱引用（weakReference），软引用(softReference)，虚引用
 */
public class EqualsController {


    public static void main(String[] args) {
        Student student = new Student(1, "111");
        Student student1 = new Student(1, "111");
        System.out.println(student == student1);
        System.out.println(student.equals(student1));
        System.out.println(student.hashCode() == student1.hashCode());
        System.gc();
    }
}
