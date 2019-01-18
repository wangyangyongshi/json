package com.example.demo.thread.one;

/**
 * Created by wangyang on 2019/1/18.
 */
public class LetterThread implements Runnable {

    @Override
    public void run() {
        char c;
        for (c = 'A'; c <= 'Z'; ++c) {
            System.out.println(c);
        }
    }
}
