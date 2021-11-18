/*
* 其他中间方法  +   结束方法
*
* */
package Basic5_Collection_Tree.test9_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>(List.of("zhang1", "zhang2", "wang5", "jiba", "jiba", "jiba"));
        ArrayList<String> arrList2 = new ArrayList<>(List.of("zhang1", "zhang2", "wang5"));

        // 截取， 保留前两个 数据。
//        arrList.stream().limit(2).forEach(s -> System.out.println(s));

        // 跳过 几个
//        arrList.stream().skip(2).forEach(s -> System.out.println(s));

        // 把两个流 进行 合起来， concat is a static method
//        Stream.concat(arrList.stream(), arrList2.stream()).forEach(s -> System.out.println(s));

        // distinct 去除重复的元素。
//        arrList.stream().distinct().forEach(s -> System.out.println(s));


        // forEach: 对流的每一个元素进行 执行操作：
        // Consumer 接口中的(唯一)方法： void accept（T t）: 对给定的参数 进行 操作。
        arrList.stream().forEach(
                new Consumer<String>() {
                    @Override
                    public void accept(String s) { // s 表示 stream 中的每一个数据。
                        System.out.println(s);
                    }
                }
        );

        // lambda  表达方式：
        arrList.stream().forEach(
                (String s ) -> {
                    System.out.println(s);
                }
        );

        //  简化lambda ：  最简单， 推荐使用
        arrList.stream().forEach(s -> System.out.println(s));
    }
}
