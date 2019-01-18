package com.example.demo.controller;

/**
 * Created by wangyang on 2019/1/16.
 */
public class StringController {


    public static void main(String[] args) {
        String s1 = "a" + "b";//直接会被优化成ab字符串放到常量池中
        String s2 = "a";
        String s3 = "b";
        String s4 = s2 + s3;
        String s5 = "ab";
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);

        String s6 = "aa";
        String s9 = "vv".intern();
        String s7 = s6.intern();
        System.out.println(s6==s7);
        System.err.println(s9 == s7);

    }

}
