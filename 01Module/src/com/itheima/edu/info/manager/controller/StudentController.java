/*
* interacts with the users
*
* */

package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class StudentController {
    // 那就要创建一个 StudentService
    private StudentService studentService = new StudentService();
    public void start() {
        Scanner sc = new Scanner(System.in);
        studentloop: while(true) {
            System.out.println("--------欢迎来到黑马信息管理系统--------");
            System.out.println("请您选择： 1.添加学生  2.删除学生 3.修改学生 4.查看学生 5退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println("1.添加学生");
                    addStudent();
                    break;
                case "2":
                    System.out.println("2.删除学生");
//                    deleteStudent(list);
                    break;
                case "3":
                    System.out.println("3.修改学生");
//                    modifyStu(list);
                    break;
                case "4":
                    System.out.println("4.查看学生");
                    findAllStudent();
                    break;
                case "5":
                    System.out.println("5退出");
                    break studentloop;
                default:
                    System.out.println("输入错误， 王八蛋");
                    break;
            }
        }
    }

    public void findAllStudent() {
        // 调用studentService 里面的方法。
        Student[] stus = studentService.findAllStudent();
        // 假如内存为null， 说明数组没有指向任何一个。 肯定为空。
        if(stus == null) {
            System.out.println("学生数量为0");
            return;
        }
            System.out.println("学号\t姓名\t年龄\t\t生日");
            for (int i = 0; i < stus.length ; i++) {
                // 因为数组可能没有被装满。
                Student stu = stus[i];
                if(stu != null) {
                    System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t" + stu.getBirthday());
                }
            }

    }

     public void addStudent() {
        // 1.receice student info via keyboard
         Scanner sc = new Scanner(System.in);
         // 但是要进行id的判断， 用一个while true 进行判断
         String id;
         while(true) {
             System.out.println("please input the student id");
             id = sc.next();
             boolean flag = studentService.isExist(id);
             if(flag) {
                 System.out.println("id was already taken");
             } else {
                 break;
             }
         }

         System.out.println("please input the student name");
         String name = sc.next();
         System.out.println("please input the syudent age");
         String age = sc.next();
         System.out.println("please input the syudent birthday");
         String birthday = sc.next();
         // 2. 封装成学生对象
            Student stu = new Student(id ,name, age, birthday);
         // 3. 将学生对象传给StudentService 中的addStudent方法
         boolean result = studentService.addStudent(stu);
         // 4. 根据返回的boolean 类型， 在控制台打印成功失败。
         if(result) {
             System.out.println("添加成功");
         } else {
             System.out.println("添加失败");
         }
     }

}
