package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangyang on 2019/1/14.
 */
public class ListController {


    public static void main(String[] args) {
        List aa = new ArrayList();
        List bb = new ArrayList();
        aa.add(1);
        aa.add(2);
        aa.add(3);
        aa.add(4);
        aa.add(5);

        bb.add(1);
        bb.add(7);
        int count = 0;
        for (int i = 0; i < aa.size(); i++) {
            count++;
            for (int j = 0; j < bb.size(); j++) {
                count++;
                if (aa.get(i) == bb.get(j)) {
                    bb.remove(j);
                }
            }
        }
        System.out.println(count);
        System.out.println(bb);
    }
}