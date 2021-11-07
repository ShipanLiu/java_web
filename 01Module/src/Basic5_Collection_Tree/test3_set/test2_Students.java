/*
* 对Student对象 进行排序。
*
* 在Studnet 类里面需要 implements Comparable
*
* 年龄按照从小到大排列， 如果年龄一样， 则按照姓名首字母排序
* 如果姓名和年龄一样， 才认为是同一个学生对象。， 不存
*
* */

package Basic5_Collection_Tree.test3_set;

import java.util.TreeSet;

public class test2_Students {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();

        Student s1 = new Student("jier1", 21 );
        Student s2 = new Student("jier2", 28 );
        Student s3 = new Student("jier3", 26 );
        Student s4 = new Student("jier1", 21 );
        Student s5 = new Student("jier5", 28 );




        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for(Student stu : ts) {
            System.out.println(stu.getName() + "/" + stu.getAge());
        }
    }
}
