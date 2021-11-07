/*
* 类型通配符
*
* Integer 的继承关系
*
* Object > Numver > Integer
*
* */


package Basic5_Collection_Tree.test6_Type_WildCard;

import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        // List 任意
        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();



        // List 有上限
        // 错误。
//        List<? extends Number> list4 = new ArrayList<Object>();
        List<? extends Number> list5 = new ArrayList<Integer>();



        // List 有下限

        // 错误
//        List<? super Number> list6 = new ArrayList<Integer>();
        List<? super Number> list6 = new ArrayList<Object>();
    }
}
