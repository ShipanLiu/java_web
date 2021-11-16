/*
* HashMap 存储 ArrayList 元素 并且遍历
*
* key: String
* value: ArrayList
*
* {"001": ArrayList, "002": ArrayList, "003": ArrayList }
*
* */

package Basic5_Collection_Tree.test9_Map;

import java.lang.reflect.Array;
import java.util.*;

public class test4_Exercise3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(List.of("jiba1"));
        ArrayList<String> list2 = new ArrayList<>(List.of("jiba2"));
        ArrayList<String> list3 = new ArrayList<>(List.of("jiba3"));
        ArrayList<String> list4 = new ArrayList<>(List.of("jiba4"));
        list1.add("dan");

        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        hm.put("1", list1);
        hm.put("2", list2);
        hm.put("3", list3);
        hm.put("4", list4);

        // 遍历HashMap， 利用keySet 及逆行遍历：
        Set<String> keySet = hm.keySet();

        for (String s : keySet) {
            System.out.println(s + " : " + hm.get(s));
        }




    }
}
