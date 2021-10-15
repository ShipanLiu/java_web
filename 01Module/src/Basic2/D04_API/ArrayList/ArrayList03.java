/*
* store 3 Student objects and iterate in ArrayList
*
* */

package Basic2.D04_API.ArrayList;

import Basic2.D04_API.ArrayList.domin.Student;

import java.util.ArrayList;

public class ArrayList03 {
    public static void main(String[] args) {
        Student stu1 = new Student(20, "jiba1");
        Student stu2 = new Student(21, "jiba2");
        Student stu3 = new Student(22, "jiba3");

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getName());
            System.out.print(",");
            System.out.println(list.get(i).getAge());
        }
    }
}
