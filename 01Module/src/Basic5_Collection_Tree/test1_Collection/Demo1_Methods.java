package Basic5_Collection_Tree.test1_Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1_Methods {
    public static void main(String[] args) {
        // 01-add
        // Collection 是一个接口, 不能 new Collection<>();
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
//        System.out.println(collection);

        // 02- remove
//        removeMethod(collection);


        // 03-removeIf
//        removeIfMethod(collection);

        // 04- clear
//        clearMethod(collection);

        // 05-contains 判断是否存在某元素
        boolean res = collection.contains("aaa");
        System.out.println(res);

        // 06-isEmpty
        boolean res1 = collection.isEmpty();
        System.out.println(res1);

        // 07-size
        System.out.println(collection.size());
    }

    private static void clearMethod(Collection<String> collection) {
        //04-clear
        collection.clear();
        System.out.println(collection);
    }

    private static void removeIfMethod(Collection<String> collection) {
        //removeIf 里面包含 lambda表达式， 相当于接口的实现类：   boolean test(String t);
        // removeIf will iterate the collection and s here means each ele in the collecttion
        // if s == "aaa", the the "aaa" will be deleted.
        collection.removeIf(
                (String s) -> {
                    return s == "aaa";
                }
        );
        System.out.println(collection);  // aaa 被删除掉了。

    }

    private static void removeMethod(Collection<String> collection) {
        // remove
        boolean res1 = collection.remove("aaa");
        boolean res2 = collection.remove("ddd"); // false
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(collection);
    }
}
