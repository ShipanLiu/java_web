/*
* Linked List， 底层实现 是链表。
*
*
* */

package Basic5_Collection_Tree.test2_List_linkedList;

import java.util.LinkedList;

public class Demo2_DateStructure {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

//        for(String s : list) {
//            System.out.println(s);
//        }

        // linkedList 特有的方法
        list.addFirst("jiba");
        list.addLast("dan");
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

    }
}
