package com.example.demo.controller;

import com.example.demo.bean.Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by wangyang on 2019/1/18.
 * hash表和链表的结合体
 */
public class HashController {

    public static void main(String[] args) {

        Student student = new Student(11, "1111");
        Student student1 = new Student(11, "1111");
        Set<Student> set = new HashSet<>();
        //set不允许集合中有重复的值
        set.add(student1);
        set.add(student);

        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()){
            System.err.println(iterator.next());
        }
        System.out.println("==================");
        System.out.println(set.contains(student1));
        /**
         * 如果重写hashcode方法时候，直接return 10,那么再使用hashset,hashtable时候，这些与hash表有关的东西就会失去意义，而
         * 变成一个链表，从而每次去查找的时候，都是遍历链表，性能问题重现
         */

    }
}
