package Basic2.D04_API.StudentManageSystem;

import Basic2.D04_API.StudentManageSystem.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {

        // create an Array
        Student initStu = new Student("1", "1", 1, "1");
        ArrayList<Student> list = new ArrayList<>();
        list.add(initStu);
        Scanner sc = new Scanner(System.in);
        lo:
        while (true) {
            System.out.println("welcome to student management system");
            System.out.println("1 add one student");
            System.out.println("2 delete one student");
            System.out.println("3 modify one studnet");
            System.out.println("4 check the studnets");
            System.out.println("5 return");
            System.out.println("please input your choice");
            String choice = sc.next();

            switch (choice) {
                case "1":
                    System.out.println("th  e function you've choosed is ADD");
                    addStudent(list);
                    break;
                case "2":
                    System.out.println("the function you've choosed is DELETE");
                    deleteStudent(list);
                    break;
                case "3":
                    System.out.println("the function you've choosed is MODIFY");
                    modifyStu(list);
                    break;
                case "4":
                    System.out.println("the function you've choosed is CHECK");
                    checkStu(list);
                    break;
                case "5":
                    System.out.println("the function you've choosed is RETURN  ");
                    break lo;
                default:
                    System.out.println("wrong input");
                    break;
            }
        }
    }

    public static void modifyStu(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sid you want modify");
        String sid = sc.next();

        if (!ifExist(sid, list)) {
            System.out.println("the sid you entered is wrong");
            return;
        }
        System.out.println("1 modify name/ 2 modify age/ 3 modify birthday/ 0 return");
        String choice = sc.next();

        Student stu = list.get(indexOfModified(sid, list));

        los:
        while (true) {
            switch (choice) {
                case "1":
                    System.out.println("enter the new name");
                    String newName = sc.next();
                    stu.setName(newName);
                    System.out.println("input your next choice to modify? 1/2/3/0");
                    choice = sc.next();
                    break;
                case "2":
                    System.out.println("enter the new age");
                    int newAge = sc.nextInt();
                    stu.setAge(newAge);System.out.println("input your next choice to modify? 1/2/3/0");
                    choice = sc.next();
                    break;
                case "3":
                    System.out.println("enter the new birthday");
                    String newBir = sc.next();
                    stu.setBirthday(newBir);
                    System.out.println("input your next choice to modify? 1/2/3/0");
                    choice = sc.next();
                    break;
                case "0":
                    System.out.println("modify finished");
                    break los;
            }
        }
    }

    public static int indexOfModified(String sid, ArrayList<Student> list) {
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSid().equals(sid)) {
                index = i;
            }
        }
        return index;
    }

    public static boolean ifExist(String sid, ArrayList<Student> list) {
        boolean isExist = false;
        // get the student
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSid().equals(sid)) {
                isExist = true;
            }
        }
        return isExist;
    }

    public static void deleteStudent(ArrayList<Student> list) {
        // pruf if the stiudent sid exist or not
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the sid that you want delete");
        String sid = sc.next();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getSid());
            if (list.get(i).getSid().equals(sid)) {
                list.remove(i);
                System.out.println("delete with success");
                break;
            } else if (i == list.size() - 1) {
                // it means this is the last one and sadly it does not fit as well
                System.out.println("the sid you entered does not exist");
            }
        }
    }

    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the sid");
        String sid = sc.next();
        los: while(true) {
            if(ifExist(sid, list)) {
                System.out.println("sid already exist, please input a new one");
                System.out.println("input the new sid");
                sid = sc.next();
            } else{
                break los;
            }
        }

        System.out.println("input the name");
        String name = sc.next();
        System.out.println("input the age");
        int age = sc.nextInt();
        System.out.println("input the birthday");
        String birthday = sc.next();
        Student jier = new Student(sid, name, age, birthday);
        list.add(jier);
        System.out.println("完事儿");
    }

    public static void checkStu(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("no data");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t生日");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getSid() + "\t" + list.get(i).getName() + "\t" + list.get(i).getAge() + "\t" + list.get(i).getBirthday());
        }
    }
}
