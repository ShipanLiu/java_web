/*
* 迭代器： list 里 专用的
*
* */

package Basic5_Collection_Tree.test1_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo2_Iterator {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        // get the one Iterator instance
        // once the iterator was created, the it will point to 0 index;
        Iterator<String> it = list.iterator();

        // use the methods
        // hasNext means if the element is availiable where the index point at now.
        // 当前被指针指向的元素， 是否存在。
        System.out.println(it.hasNext());


        // next:  get the current ele + index points to next one
        System.out.println(it.next());


        // remove()  方法。


        // 最保险的调用方法。  全部打印
        while(it.hasNext()){
            System.out.println(it.next());
        }

        checkAndDelete();

    }




    public static void checkAndDelete() {
        Collection<String> list = new ArrayList<>();
        list.add("qq");
        list.add("ww");
        list.add("ee");
        list.add("rr");
        list.add("tt");
        list.add("yy");

        Iterator<String> iterator = list.iterator();


        // method one
//        while(iterator.hasNext()) {
//            String item = iterator.next();
//            if(item.equals("tt")) {
//                iterator.remove();
//            }
//        }

        // method 2
        list.removeIf(
                (String str) -> {
                    return str.equals("ww");
                }
        );

        System.out.println(list);
    }
}
