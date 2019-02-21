package com.example.demo.controller;

import java.util.Random;

/**
 * Created by wangyang on 2019/1/18.
 * <p>
 * final类修饰的变量--》放到常量池中
 */
public class FinalController {

    public static void main(String[] args) {
//        String a = new String();//=-------------->final修饰
        //并不是被final修饰的成员变量就一定是编译期常量了
        final int aa = new Random().nextInt(20);
        System.out.println(aa);

    }

}
