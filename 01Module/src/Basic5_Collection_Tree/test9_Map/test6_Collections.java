package Basic5_Collection_Tree.test9_Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class test6_Collections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(5);

        // 无返回值
        Collections.sort(list);

        Collections.reverse(list);

        Collections.shuffle(list);

        System.out.println(list);

    }
}
