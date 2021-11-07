/*
* 泛型 放到class 后面
*
* */


package Basic5_Collection_Tree.test4_GenericDemo;

import java.util.ArrayList;
import java.util.Collection;

public class test2 {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();
        s.setName("jiba");
        t.setAge(30);

        // 但是 问题是：  setAge 只能传进去 一个  String 类型的。

        // 这里的 你想传 String 或者是 Integer 都可以，
        Generic <String> g1 = new Generic<String>();
        g1.setT("jier");
        System.out.println(g1.getT()); //jier


        Generic<Integer> g2 = new Generic<>();
        g2.setT(2);
        System.out.println(g2.getT()); // 2
        g2.show(3);


        // 这里不用《》， 因为在show 方法里面已经指定了。
        Generic g3 = new Generic();
        g3.show(500);
        g3.show("jier");
    }
}
