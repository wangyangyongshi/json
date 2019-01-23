package com.example.demo.thread.one;

/**
 * @author 王二小
 * @date 2019/1/20 23:09
 */
public class ShareOne {

    public synchronized Integer Number(int i) {
        System.out.print(i + "" + (i + 1));
        i += 1;
        notifyAll();
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return i;
    }

    public synchronized char Letter(char c) {
        System.out.println(c + "");
        notifyAll();
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return c;
    }
}
