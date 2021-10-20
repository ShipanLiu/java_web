/*
* crud of the database
*
*
* */


package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

public class StudentDao {
    // 创建学生数组对象
    private static Student[] stus = new Student[5];

    public Student[] findAllStudent() {
        return stus;
    }

    public boolean addStudent(Student stu) {
        // 添加学生到数组中null的位置。
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            if(stus[i] == null) {
                // 记录第一个null 的位置， 以便存进去。
                index = i;
                break;
            }
        }
        if(index == -1) {
            System.out.println("the array is full");
            return false;
        } else {
            stus[index] = stu;
            return true;
        }

    }
}
