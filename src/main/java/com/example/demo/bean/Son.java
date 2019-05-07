package com.example.demo.bean;

/**
 * Created by wangyang on 2019/5/7.
 */
public class Son extends Student {

    static {
        System.out.println("======子类的静态代码块");
    }

    {
        System.out.println("======子类的非静态代码块");
    }

    public Son(){
        System.out.println("=====子类的构造方法");
    }


    public static void main(String[] args) throws InterruptedException {
        Son son = new Son();
        Thread.sleep(3000);
        System.err.println("=============================");
        Student student = new Student();
    }
}
