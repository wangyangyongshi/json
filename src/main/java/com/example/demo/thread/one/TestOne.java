package com.example.demo.thread.one;

/**
 * Created by wangyang on 2019/1/18.
 * https://blog.csdn.net/u014297722/article/details/70174038
 */
public class TestOne {

    public static void main(String[] args) {
        ShareOne shareOne = new ShareOne();
        NumberThread numberThread = new NumberThread(shareOne);
        Thread threadNumber = new Thread(numberThread);

        LetterThread letterThread = new LetterThread(shareOne);
        Thread threadLetter = new Thread(letterThread);
        threadNumber.start();
        threadLetter.start();

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
