package com.example.demo.thread.one;

/**
 * Created by wangyang on 2019/1/18.
 */
public class LetterThread implements Runnable {
    private ShareOne shareOne;

    public LetterThread(ShareOne shareOne) {
        this.shareOne = shareOne;
    }

    @Override
    public void run() {
        char c;
        for (c = 'A'; c <= 'Z'; ++c) {
            c = shareOne.Letter(c);
            if (c >= 'Z') {
                break;
            }
        }
    }
}
