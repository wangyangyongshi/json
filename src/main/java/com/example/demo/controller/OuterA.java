package com.example.demo.controller;

/**
 * Created by wangyang on 2019/2/21.
 */
public class OuterA {


    public void method() {
        //优化版
        Inter i = new Inter() {//多态
            @Override
            public void show() {
                System.out.println("show");
            }

            @Override
            public void show2() {
                System.out.println("show2");
            }
        };
        i.show();
        i.show2();
    }

}
