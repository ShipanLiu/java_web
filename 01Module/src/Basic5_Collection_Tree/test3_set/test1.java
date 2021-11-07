/*
* 因为set 的父亲是collection， 所以set可以使用Collection 所有的方法。
*
*
* */


package Basic5_Collection_Tree.test3_set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class test1 {
    public static void main(String[] args) {
        // 因为Set 是 interface， 所以只能 new 一个实现类。
        Set<String> set = new TreeSet<>();
        set.add("ccc");
        set.add("aaa");
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("bbb");

        // 因为set 没有索引， 所以不能用for循环
        // 用Iterator
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 也可以用for增强（因为底层是 iterator实现的）
        for(String s : set) {
            System.out.println(s);
        }

        // treeSet 就已经自动对内部的元素进行排序从了。
    }
}
