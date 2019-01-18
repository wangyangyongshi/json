package com.example.demo.thread.one;

/**
 * Created by wangyang on 2019/1/18.
 */
public class TestOne {

    public static void main(String[] args) {
        NumberThread numberThread = new NumberThread();
        Thread thread = new Thread(numberThread);
        thread.start();
    }

}
