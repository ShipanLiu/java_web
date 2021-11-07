package Basic5_Collection_Tree.test2_List_linkedList;

import java.util.ArrayList;
import java.util.List;

public class Demo1_List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("aaa");




        // 因为继承了 Collection，遍历：
        //01
//        Iterator<String> it = list.iterator();
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }

        // 01
//        for(String a : list) {
//            System.out.println(a);
//        }


        list.add(4, "jiba");
        list.remove(0);
        list.set(0, "dan");

        list.get(0);


        System.out.println(list);
    }
}
