/*
* 两个ArrayList， 6 men，  6 women
*
* 男的 只要名字为三个字的前两人
*
* 女的 只要 姓杨的， 并且不要第一个人。
*
* 把过滤后的 男女混合在一起
*
*创建 演员对象， 把上面的数据放在 constructor 里面， 遍历数据
* */


package Basic5_Collection_Tree.test9_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6_Actor_Exercise {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>(List.of("张国立","张继","刘烨","郑伊健","徐峥","王宝强"));
        ArrayList<String> womanList = new ArrayList<>(List.of("郑爽", "杨子", "关小羽", "张天爱", "杨幂", "赵丽颖"));

        Stream<String> stream1 = manList.stream().filter(s -> s.length() == 3).limit(2);
        Stream<String> stream2 =  womanList.stream().filter(s -> s.startsWith("杨")).skip(1);

        Stream.concat(stream1, stream2).forEach(s -> {
            // 把每一个 s 都封装成 一个 Actor
            Actor singleActor = new Actor(s);
            System.out.println(singleActor);
        });
    }
}
