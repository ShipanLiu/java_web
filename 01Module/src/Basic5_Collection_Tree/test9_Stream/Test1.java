/*
* 小案例： 把 开头 为ji 的 长度为5 的 放到一个集合里面， 然后遍历。
*
* */

package Basic5_Collection_Tree.test9_Stream;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(List.of("jiba1", "jiab2", "jab32", "jiba4"));
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if(s.startsWith("ji")) {
                list2.add(s);
            }
        }


        ArrayList<String> list3 = new ArrayList<>();
        for (String s : list2) {
            if(s.length() == 5) {
                list3.add(s);
            }
        }
//
        for (String s : list3) {
            System.out.println(s);
        }

        // Stream 流的方式：
        list1.stream().filter(s -> s.startsWith("ji")).filter(s -> s.length() == 5).forEach(s -> System.out.println(s));
    }

}
