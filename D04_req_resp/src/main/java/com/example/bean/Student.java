/*
* this is for encaplulating the parameters.  name , age , hobby
*
* for test03
*
* */


package com.example.bean;

import java.util.Arrays;

public class Student {
    private String name;
    private String age;
    private String[] hobby;

    public Student() {
    }

    public Student(String name, String age, String[] hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String[] getHobby() {
        return hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}
