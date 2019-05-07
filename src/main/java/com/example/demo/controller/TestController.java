package com.example.demo.controller;

/**
 * Created by wangyang on 2019/3/18.
 */
public class TestController {

    public static void main(String[] args) {

        String[] s1 = {"中国","山西","太原","TYUT","zyy","加拿大","不知道哪个州","不知道哪个市","不知道哪个学校","yxf"};

        String[] s2 = new String[9];

        System.arraycopy(s1, 0, s2, 0, 9);
        for(int i = 0 ;i<s2.length;i++){
            System.out.println(s2[i]);
        }


    }
}
