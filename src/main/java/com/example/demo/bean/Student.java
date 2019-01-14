package com.example.demo.bean;

/**
 * Created by wangyang on 2019/1/14.
 */
public class Student<T> {
    private T age;
    private T name;

    public Student(T age, T name) {
        this.age = age;
        this.name = name;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}
