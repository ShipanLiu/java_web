/*
* <> 泛型
*
*
* */


package Basic2.D04_API.ArrayList;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        // 会添加任意数据类型， 不好， 需要限制。
//        list.add("abc");
//        list.add(123);
//        list.add(true);
//        // will not sout the adress the the inhalt
//        System.out.println(list); // [abc, 123, true]

        ArrayList<String> list = new ArrayList<>();
        list.add("jier1");
        list.add("jier2");
        list.add("jier3");
        list.add("jier4");
        list.add(1, "Dan"); // [jier1, Dan, jier2, jier3, jier4]
        System.out.println(list);
    }
}
