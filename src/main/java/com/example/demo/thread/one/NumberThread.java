package com.example.demo.thread.one;

/**
 * Created by wangyang on 2019/1/18.
 */
public class NumberThread implements Runnable {

    private ShareOne shareOne;

    public NumberThread(ShareOne shareOne) {
        this.shareOne = shareOne;
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            i = shareOne.Number(i);
            if (i >= 8) {
                break;
            }
        }
    }
}
