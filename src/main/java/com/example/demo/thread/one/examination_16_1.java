package com.example.demo.thread.one;

/**
 * @author 王二小
 * @date 2019/1/19 14:38
 */
public class examination_16_1 {
    //  这个类相当于共享变量
    //同步监视器类，提供线程安全的方法
    class printResult {
        private int number = 1;
        private char character = 'A';

        //提供两个synchronized方法
        //  synchronized方法  ；notifyall()的位置在当前线程wait()的前面
        public synchronized void printnumber() {
            System.out.print(number + "" + (number + 1));
            number += 2;
            notifyAll();
            try {
                //  大于52之后不再等待;
                if (number <= 52) wait();
                //使用while(number <= 52) wait();会一直循环，后面notify也跳不出来
            } catch (Exception e) {
                System.out.println(e.toString());
            }

        }

        public synchronized void printcharacter() {
            System.out.println(character + " ");
            character += 1;
            notifyAll();
            try {
                //  大于Z之后不再等待;如果不加最后不会结束！！阻塞了
                if (character <= 'Z') wait();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }

    class Number implements Runnable {
        private printResult printresult;

        public Number(printResult p) {
            this.printresult = p;
        }

        private int i = 0;

        public void run() {
            for (; i < 26; i++) {
                //调用同步监视器中的方法
                printresult.printnumber();
                //System.out.println(Thread.currentThread().getName()+"  "+i);
            }
        }
    }

    class Character implements Runnable {
        private printResult printresult;

        public Character(printResult p) {
            this.printresult = p;
        }

        public void run() {
            for (int i = 0; i < 26; i++) {
                //调用同步监视器中的方法
                printresult.printcharacter();
            }
        }
    }

    public static void main(String[] args) {
        examination_16_1 examination = new examination_16_1();
        printResult p = examination.new printResult();
        Number number = examination.new Number(p);
        Character character = examination.new Character(p);
        //  启动两个线程，一个输出数字、一个输出字母
        new Thread(number).start();
        new Thread(character).start();
//        new Thread(number,"线程0").start();
//        new Thread(number,"线程1").start();

        try {
            //希望 子线程在start就绪后立即启动，那么可以将主线程sleep 15毫秒
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
