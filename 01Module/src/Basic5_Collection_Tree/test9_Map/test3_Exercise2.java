/*
*
* ArrayList 集合 存 HashMap 元素 并且遍历
*
* 就相当于 ： [{String: String}, {}, {}]
* */

package Basic5_Collection_Tree.test9_Map;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class test3_Exercise2 {
    public static void main(String[] args) {
        HashMap<String, String> hs1 = new HashMap<>();
        HashMap<String, String> hs2 = new HashMap<>();
        HashMap<String, String> hs3 = new HashMap<>();
        ArrayList<HashMap> arr = new ArrayList<>();

        hs1.put("001", "jier1");
        hs2.put("002", "jier1");
        hs3.put("003", "jier1");

        arr.add(hs1);
        arr.add(hs2);
        arr.add(hs3);

        // 遍历：
        for(HashMap<String, String> hm : arr) {
            //  再次遍历单个hm
            Set<String> keys = hm.keySet();
            for(String key : keys) {
                String value = hm.get(key);
                System.out.println(key + "," + value);
            }
        }

    }
}
