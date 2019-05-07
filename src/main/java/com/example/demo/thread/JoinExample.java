package com.example.demo.thread;

/**
 * Created by wangyang on 2019/3/18.
 */
public class JoinExample {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("First task started");
                System.out.println("Sleeping for 2 seconds");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("First task completed");
            }
        });


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Second task completed");
            }
        });

        // Line 16
        t1.start();
        t1.join();
        t.start(); // Line 15
    }


}
