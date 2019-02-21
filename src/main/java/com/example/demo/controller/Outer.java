package com.example.demo.controller;

/**
 * Created by wangyang on 2019/2/21.
 */
public class Outer {

    String string = "";

    void outerTest(char ch) {
        Integer integer = 1;
        class inner {
            void innerTest() {
//                ch = 'v';
                System.out.println('1');
                System.out.println(ch);
                System.out.println(integer);
            }
        }
        new inner().innerTest();
    }

    public static void main(String[] args) {
        new Outer().outerTest('a');

//        new Outer().outerTest(' ').;
//        new inner()
    }

}
