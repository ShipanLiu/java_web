/*
 * 要求创建一个Student的数组， 并且iterate
 *
 * */

package Basic2.D04_API.ArrayList;

import Basic2.D04_API.ArrayList.domin.Student;

public class TestObjectArray {

    public static void main(String[] args) {
        // Studnet对象数组, 可以存三个学生， 第四个来了就不行了。
        Student[] stuArr = new Student[3];


        Student stu1 = new Student(21, "jiba1");
        Student stu2 = new Student(22, "jiba2");
        Student stu3 = new Student(23, "jiba3");

        stuArr[0] = stu1;
        stuArr[1] = stu2;
        stuArr[2] = stu3;

        for (int i = 0; i <stuArr.length ; i++) {
            System.out.println(stuArr[i].getName() + "," + stuArr[i].getAge() );
        }

    }
}
