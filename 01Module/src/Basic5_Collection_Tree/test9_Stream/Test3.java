/*
* filter 方法 ：  把不是 张的 都排除出来：
*
*
* */


package Basic5_Collection_Tree.test9_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>(List.of("张jiba1", "张dan", "网二"));
        // filter will get each date in the stream;
        // the s in test method presents each date
        // the only thing we can do is to judge the s
        // if it is true, the data will be kept
        // if false, the data will be abandent.
        arrList.stream().filter(
                new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.startsWith("张");
                    }
                }
        ).forEach(e -> System.out.println(e));

        System.out.println("#####################");

        // 因为 Predicate 接口里面只有一个 抽象方法 test，
        // 所以可以使用 lambda 表达式来简化。

        arrList.stream().filter((String s) -> s.startsWith("张")).forEach(s -> System.out.println(s));
    }
}
