/*
* SetTree 的另一种 排序方式。
*
* Comparator 也是一个接口， 可以以 lanbda 或者 匿名内部类的 方式 放到构造方法里面去。
*
* */

package Basic5_Collection_Tree.test3_set;

import java.util.Comparator;
import java.util.TreeSet;

public class test3_Teacher {
    public static void main(String[] args) {
        // 方法1： 匿名内部类
//        TreeSet<Teacher> ts = new TreeSet<>(new Comparator<Teacher>() {
//            @Override
//            public int compare(Teacher o1, Teacher o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

        // 方法2： lambda
        TreeSet<Teacher> ts = new TreeSet<>(
                (Teacher o1, Teacher o2) -> {
                    int result = o1.getAge() - o2.getAge();
                    return result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                }
        );

        Teacher s1 = new Teacher("jier1", 21 );
        Teacher s2 = new Teacher("jier2", 28 );
        Teacher s3 = new Teacher("jier3", 26 );
        Teacher s4 = new Teacher("jier1", 21 );
        Teacher s5 = new Teacher("jier5", 28 );

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for(Teacher teacher : ts) {
            System.out.println(teacher.getName() + "/" + teacher.getAge());
        }
    }
}
