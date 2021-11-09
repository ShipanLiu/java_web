/*
*
* 录入三个学生信息， 按照总分 从低到高 排序
*
* */

package Basic5_Collection_Tree.test7_TreeSet_Exercise;

import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();

        Student s1 = new Student("jier1", 83, 80, 80);
        Student s2 = new Student("jier2", 81, 80, 81);
        Student s3 = new Student("jier3", 82, 80, 82);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        for(Student st: ts) {
            System.out.println(st);
        }
    }
}
