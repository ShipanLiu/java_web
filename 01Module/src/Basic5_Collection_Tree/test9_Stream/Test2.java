/*
* Stream 的应用场景。
*
* */


package Basic5_Collection_Tree.test9_Stream;

import java.util.*;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        // 单列集合
//       listStream();


        // 双列集合
//        MapStream();


        // Array
//        arrayStream();

        // 同种数据类型的 多个数据
        Stream.of(1, 2, 3, 4, 5).forEach(s -> System.out.println(s));


    }

    private static void arrayStream() {
        int[] arr = {1, 2, 3};
        Arrays.stream(arr).forEach(s -> System.out.println(s));
    }

    private static void MapStream() {

        // 双列集合：
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("jiba1", 21);
        hm.put("jiba2", 22);
        hm.put("jiba3", 23);
        hm.put("jiba4", 24);

        // 间接使用 Stream， 先获取 keySet 集合， 再用 集合里面的 stream
        Set<String> keys = hm.keySet();
        keys.stream().forEach(s -> System.out.println(s + " : " + hm.get(s)));

        //或者用entrySet：
        //  先获得 所有的key value 对象
        //  再遍历这个set集合
        hm.entrySet().stream().forEach(s -> System.out.println(s));
    }

    private static void listStream() {
        // 单列集合
        ArrayList<String> list = new ArrayList<>(List.of("aaa", "bbb", "ccc"));

        Stream<String> stream = list.stream();
        stream.forEach(s -> System.out.println(s));

        // 一般写在一起：
        list.stream().forEach(s -> System.out.println(s));

    }
}
