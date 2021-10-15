package Basic2.D04_API.ArrayList;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("jiba");
//        removeEle(list);
//        setEle(list);
        getEle(list);
    }

    public static void getEle(ArrayList list) {
        System.out.println(list.size()); // 6
        System.out.println(list.get(0));

    }

    public static void setEle(ArrayList list) {
        list.set(0, "jierba"); // [jierba, 111, 222, 333, 444, jiba]
        System.out.println(list);
    }

    private static void removeEle(ArrayList list) {

//        boolean b1 = list.remove("abc");
//        boolean b2 = list.remove("zzz");

//        System.out.println(b1); // true
//        System.out.println(b2); // false
//        System.out.println(list); // [111, 222, 333, 444, jiba]

        // 02 remove according to index return the removed ele
        list.remove(0);
        System.out.println(list);
    }
}
