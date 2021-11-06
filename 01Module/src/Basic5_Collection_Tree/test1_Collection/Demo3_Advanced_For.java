/*
*
*
* */


package Basic5_Collection_Tree.test1_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo3_Advanced_For {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("qq");
        list.add("ww");
        list.add("ee");
        list.add("rr");
        list.add("tt");
        list.add("yy");

        /*
        * 快捷方式：  list.for  +  enter
        *
        * */
        for(String item : list) {
            System.out.println(item);

            // 注意：
            // 这时候， list 里面不会改成 “jiba”
            item = "jiba";
        }

        System.out.println(list);
    }
}
