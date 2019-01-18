package com.example.demo.bean;

import java.io.Serializable;

/**
 * Created by wangyang on 2019/1/14.
 */
public class Student implements Cloneable, Serializable {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Student) {
            if (((Student) obj).getName() == this.name && ((Student) obj).getAge() == this.age) {
                return true;
            }
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + name.hashCode();
        result = result * 31 + age;
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
