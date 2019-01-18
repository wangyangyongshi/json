package com.example.demo.controller;

/**
 * Created by wangyang on 2019/1/18.
 */
public class FloatController {

    public static void main(String[] args) {
//        double v = 0.3;
//        3 * 0.1 = v;
        System.out.println(3 * 0.1 == 0.3);

        short s1 = 1;
//        int s2 = s1 + 1;
//        System.out.println(s2);
        s1 = s1 += 1;//------------------------------>no  fault;

    }

}
