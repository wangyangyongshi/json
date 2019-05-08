package com.example.demo.controller;

/**
 * Created by wangyang on 2019/5/8.
 */
public class BinarySearchController {

    public static void main(String[] args) {

        System.out.println(code());
    }

    private static Integer code() {
        try {
            System.out.println(1/0);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 4;
        }
    }

}
