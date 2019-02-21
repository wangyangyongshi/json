package com.example.demo.thread.four;

/**
 * Created by wangyang on 2019/2/21.
 */
public class AtomicIntegerTest {
    private static final int THREADS_CONUT = 1;
    public static int count = 0;

    public static void increase() {
        count++;
//        System.out.println(count++);
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS_CONUT];
        for (int i = 0; i < THREADS_CONUT; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 2; i++) {
                        increase();
                    }
                }
            });
            threads[i].start();
        }
        System.out.println(Thread.activeCount());
        for(int i = 0;i<=Thread.activeCount();i++){
            System.out.println(Thread.currentThread().getName());
        }
//        while (Thread.activeCount() > 1) {
//            Thread.yield();
//        }
//        System.out.println(count);
    }

}
