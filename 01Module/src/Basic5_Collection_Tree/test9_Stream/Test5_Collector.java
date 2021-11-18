/*
*Stream 里面的收集方法： 因为 stream 不能改变 array里面的元素， 所以找一个东西，
* 把 stream 产生的东西 保存起来。
*
*1，2，3，4，5，6，7，8，9，10
*
*  找到 偶数。
*
*
* */

package Basic5_Collection_Tree.test9_Stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test5_Collector {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <=10 ; i++) {
            list.add(i);
        }

        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);


        // filter is for filtering
        // collect is for collecting
        // 但collect不负责创建容器， 也不负责把数据添加到容器中。
        //Collectors.toList()  会在底层创建一个 List集合， 并且把所有的数据添加到list里面
        List<Integer> collectList = list.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.println(collectList); // [2, 4, 6, 8, 10, 10, 10, 10, 10, 10]

        //Collectors.toSet()
        Set<Integer> collectSet = list.stream().filter(number -> number % 2 == 0).collect(Collectors.toSet());
        System.out.println(collectSet); // [2, 4, 6, 8, 10] 其他重复的 10 都滚蛋了。

        // Collectors.toMap()
        /*
        *  keep the people whose age is greater than 24.
        *
        * */
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("zhangsan, 23");
        nameList.add("lisi, 24");
        nameList.add("wangwu, 25");

        Map<String, String> collectMap = nameList.stream().filter(
                (String s) -> {
                    String[] split = s.split(",");
                    // 把 “24” =》 24
                    int age = Integer.parseInt(split[1].trim());
                    return age >= 24;
                }
        ).collect(Collectors.toMap(
                // the first lambda means to get the key
                (String s) -> {
                    return s.split(",")[0];
                },
                // the sectond lambda means to get the value
                (String s) -> {
                    return s.split(",")[1].trim();
                }
        ));

        System.out.println(collectMap);

    }
}
