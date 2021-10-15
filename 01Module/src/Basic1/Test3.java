package Basic1;


/*
知识点：
字符串 +
logic operator + short- circuit logic operator
*/
public class Test3 {
    public static void main(String[] args) {
        /*#01#字符窜的加操作。 就是 棉花糖*/
//        System.out.println("jiba" + 666); //jiba666
//        System.out.println("jiba" + true); // jibatrue
//
//        System.out.println(1 + 99 + "jiba"); // 100jiba
//        System.out.println("5+5="+5+5); //5+5=55
//        System.out.println("5+5="+(5+5)); // 5+5=10


        /* 02 逻辑运算符 &, | ， ！，^ 作用： 整合 多个比较表达式的条件*/
//        int x = 10;
//        System.out.println(x > 5 & x < 15);  // true   ===  5<x<15

        //  the difference between & and && is that && has short circuit effect
//        int x1 = 3;
//        int x2 = 4;
//        System.out.println(++x1 > 4 & x2-- < 5);  // false
//        System.out.println(x1); // 4
//        System.out.println(x2);  // 3


//        System.out.println(++x1 > 4 && x2-- < 5);  // false, x2-- < 5， 根本没有执行， 符号左边已经为false， 右边不执行
//        System.out.println(x1); // 4
//        System.out.println(x2);  // 4

        /*03- 三个合唱比较身高， 找出最大值*/
        int a = 150;
        int b = 210;
        int c = 165;

        int result = a > b ? a > c ? a : c : b > c ? b : c;
        System.out.println(result); // 210
    }

}
