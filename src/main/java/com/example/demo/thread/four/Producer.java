package com.example.demo.thread.four;

import java.util.Random;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by wangyang on 2019/2/21.
 * 生产者
 */
public class Producer implements Runnable {

    private volatile boolean isRunning = true;

    //生产者队列
    private final Vector sharedQueue;

    //生产者队列可以容纳的数量
    private final int size;

    private static AtomicInteger count = new AtomicInteger();

    public Producer(Vector sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        this.size = size;
    }

    @Override
    public void run() {
        int data;
        Random r = new Random();
        System.out.println("start producer id = " + Thread.currentThread().getId());
        try {
            while (isRunning) {
                // 模拟延迟
                Thread.sleep(r.nextInt(1000));

                // 当队列满时阻塞等待
                while (sharedQueue.size() == size) {
                    synchronized (sharedQueue) {
                        System.out.println("Queue is full, producer " + Thread.currentThread().getId()
                                + " is waiting, size：" + sharedQueue.size());
                        sharedQueue.wait();
                    }
                }

                // 队列不满时持续创造新元素
                synchronized (sharedQueue) {
                    // 生产数据
                    data = count.incrementAndGet();
                    sharedQueue.add(data);

                    System.out.println("producer create data:" + data + ", size：" + sharedQueue.size());
                    sharedQueue.notifyAll();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.interrupted();
        }
    }

    public void stop() {
        isRunning = false;
    }
}
