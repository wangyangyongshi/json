package com.example.demo.thread.one;

/**
 * Created by wangyang on 2019/1/18.
 */
public class NumberThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
