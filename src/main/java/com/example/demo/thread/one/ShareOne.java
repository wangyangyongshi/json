package com.example.demo.thread.one;

/**
 * @author 王二小
 * @date 2019/1/20 23:09
 */
public class ShareOne {

    public synchronized void Number(int i) {
        System.out.println(i + "" + (i + 1));
        i +=2;
        notifyAll();
        try {
            if (i > 5) wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void Letter(char c) {
        System.out.print(c + "");
        notifyAll();
        if (c > 'G') {
            try {
                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
