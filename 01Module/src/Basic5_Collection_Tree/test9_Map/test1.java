package Basic5_Collection_Tree.test9_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test1 {
    public static void main(String[] args) {
        // 这是 多态式的创建方式
        Map<String, String> map = new HashMap<>();

        // key 是唯一的
         map.put("001", "jier1");
         map.put("002", "jier1");
         map.put("003", "jier1");
         map.put("001", "jier00001");


         // clear all the key values
        // map.clear()


         // remove
//        System.out.println(map.remove("001"));


        //containsKey / containsValue / isEmpty / size()


//        System.out.println(map);  //{001=jier00001, 002=jier1, 003=jier1}



        // 元素获取的 功能：

        // 01- method
        System.out.println(map.get("001"));

        // 02-keySet, get all keys
        Set<String> strings = map.keySet();
        for(String key : strings) {
            System.out.println(key);
        }

        //03-get all values;
        Collection<String> values = map.values();
        for(String key : values) {
            System.out.println(key);
        }




        // map 元素的 遍历：

        Set<String> keys = map.keySet();
        for(String key : keys) {
            String value = map.get(key);
            System.out.println(key + "," + value);
        }

    }
}
