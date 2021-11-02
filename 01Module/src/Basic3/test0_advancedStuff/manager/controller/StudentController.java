/*
* interacts with the users
*
* */

package Basic3.test0_advancedStuff.manager.controller;

import Basic3.test0_advancedStuff.manager.domain.Student;
import Basic3.test0_advancedStuff.manager.service.StudentService;

import java.util.Scanner;

public class StudentController {
    // 那就要创建一个 StudentService
    private StudentService studentService = new StudentService();
    Scanner sc = new Scanner(System.in);

    public void start() {
        studentloop:
        while (true) {
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
                    deleteStudentById();
                    break;
                case "3":
                    System.out.println("3.修改学生");
                    updateStudent();
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
        if (stus == null) {
            System.out.println("学生数量为0");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t\t生日");
        for (int i = 0; i < stus.length; i++) {
            // 因为数组可能没有被装满。
            Student stu = stus[i];
            if (stu != null) {
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t" + stu.getBirthday());
            }
        }

    }

    public void addStudent() {
        // 1.receice student info via keyboard
        // 但是要进行id的判断， 用一个while true 进行判断
        String id;
        while (true) {
            System.out.println("please input the student id");
            id = sc.next();
            boolean flag = studentService.isExist(id);
            if (flag) {
                System.out.println("id was already taken");
            } else {
                break;
            }
        }

        Student stu = inputStudentInfo(id);
        // 3. 将学生对象传给StudentService 中的addStudent方法
        boolean result = studentService.addStudent(stu);
        // 4. 根据返回的boolean 类型， 在控制台打印成功失败。
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    //  这里里成员方法 肯定是void， 就是分配任务用的， 和数据不打交道。
    public void deleteStudentById() {
        // input id that you want delete
        String delId = inputStudentId();
        //能到这一步说明 id 肯定存在
        // go to StudentService
        studentService.deleteStudentById(delId);
        System.out.println("student id: \t" + delId + "\tdelete with success");
    }

    public void updateStudent() {
        String updateId = inputStudentId();
        Student newStu = inputStudentInfo(updateId);
        studentService.updateStudent(updateId, newStu);

        System.out.println("update with success");
    }


    // 键盘录入学生id， 并且进行判断。
    public String inputStudentId() {
        String id;
        while(true) {
            System.out.println("please input the id ");
            id = sc.next();
            boolean exists = studentService.isExist(id);
            // if the id exist
            if(!exists) {
                System.out.println("wong id to delete");
            } else {
                break;
            }
        }

        return id;
    }

    //键盘录入学生信息
    public Student inputStudentInfo(String id) {
        System.out.println("请重新输入学生姓名");
        String name = sc.next();
        System.out.println("请重新输入学生年龄");
        String age = sc.next();
        System.out.println("请重新输入学生生日");
        String birthday = sc.next();

        // 把这些信息封装成一个新的学生对象。
        Student newStu = new Student();
        newStu.setId(id);
        newStu.setName(name);
        newStu.setAge(age);
        newStu.setBirthday(birthday);
        return newStu;
    }
}

