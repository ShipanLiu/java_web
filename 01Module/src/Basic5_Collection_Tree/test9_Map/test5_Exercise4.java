/*
* 统计字符串中 每个字符出现的个数
*
* 键盘录入： aaababcacaaaa   控制台输出： a(9)b(2)c(2)
*
* 可以看成： a(9)，b(2)，c(2)
*
* 每一部分可以看成是： 字符 和 对应的 字符次数 组成。
* 可以用 Hashmap
*
* 注意 ： key 是 Character 类型，   次数 是 Integer 类型。
*
*
* */

package Basic5_Collection_Tree.test9_Map;

import java.util.HashMap;
import java.util.Set;

public class test5_Exercise4 {
    public static void main(String[] args) {
        String line = "aaababcacaaaa";
        HashMap<Character, Integer> hm = new HashMap<>();

        // 遍历字符串， 得到每一个字符
        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);
            // 判断这个key 对应的value 是不是null， 因为null 不能  null + 1
            // hm.get(key) 有装箱的操作： 把 char =》 Character
            Integer value = hm.get(key);
            if(value == null) {
                // 初始化成1. 不再是null
                // put(key,1) 有自动装箱的动作。
                hm.put(key,1);
            } else {
                value ++;
                hm.put(key, value);
            }
        }

        Set<Character> keySet = hm.keySet();
        // 要做拼接， 用 StringBuilder
        StringBuilder sb = new StringBuilder();
        for (Character key : keySet) {
//            System.out.print(key + "(" + hm.get(key) + ")");

            // 字符串的 拼接：
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }

        // 完事之后 StringBuilder =》 String
        String s = sb.toString();
        System.out.println(s);
    }
}
