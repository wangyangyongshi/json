package com.example.demo.thread.one;

/**
 * Created by wangyang on 2019/1/18.
 * https://blog.csdn.net/u014297722/article/details/70174038
 */
public class TestOne {

    public static void main(String[] args) {
        ShareOne shareOne = new ShareOne();
        NumberThread numberThread = new NumberThread(shareOne);
        Thread thread = new Thread(numberThread);
        thread.start();

        LetterThread letterThread = new LetterThread(shareOne);
        Thread threadLetter = new Thread(letterThread);
        threadLetter.start();
    }

}
