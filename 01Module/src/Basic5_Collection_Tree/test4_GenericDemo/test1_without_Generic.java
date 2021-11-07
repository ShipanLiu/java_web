/*
* demand : Collection 集合 存储 str 并且遍历。
*
* */

package Basic5_Collection_Tree.test4_GenericDemo;

import java.util.ArrayList;
import java.util.Collection;

public class test1_without_Generic {
    public static void main(String[] args) {
        //当不指定<> 的时候， c 里面默认是 Object 类型。
        Collection c = new ArrayList();

        c.add("jiba1");
        c.add("jiba2");
        c.add("jiba3");
        c.add("jiba4");
        c.add("jiba5");
        c.add(100);

        // 当不指定<> 的时候， c 里面默认是 Object 类型。
        for (Object obj : c) {
            System.out.println(obj);
        }
    }
}
