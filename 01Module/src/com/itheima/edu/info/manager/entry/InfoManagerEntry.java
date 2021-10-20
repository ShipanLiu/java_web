/*
 * the start portal of the code
 *
 * */

package com.itheima.edu.info.manager.entry;

import com.itheima.edu.info.manager.controller.StudentController;

import java.util.Scanner;

public class InfoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------欢迎来到黑马信息管理系统--------");
            System.out.println("请您选择： 1.学生管理  2.老师管理 3.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println("您的选择==》学生管理");
                    StudentController studentController = new StudentController();
                    studentController.start();
                    break;
                case "2":
                    System.out.println("您的选择==》老师管理");
                    break;
                case "3":
                    System.out.println("您的选择==》退出");
                    System.out.println("欢迎您下次使用");
                    // 意思是 退出当前正在运行的 JVM虚拟机
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }
        }

    }


}
