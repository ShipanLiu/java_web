/*
* BigDecimal  精确运算
*
*
* */

package Basic4_API.api1.api_BigDecimal;


import java.math.BigDecimal;

public class test1_problem {
    public static void main(String[] args) {
        System.out.println(10.0 / 3.0);  //3.3333333333333335
        /*
        * 十进制  =》 二进制  ==》  十进制 展示
        *
        * 小数 在转换成 二进制的时候， 由于转换机制的问题， 会导致数据丢失， 会用一个无线接近的数来表示。
        *
        * 解决办法 ： BigDecimal
        * */

        // require 小数 or string（建议使用字符串）
        BigDecimal bd1 = new BigDecimal(10.0);
        BigDecimal bd2 = new BigDecimal("0.3");

        System.out.println(bd1); // 10
        System.out.println(bd2); // 0.3

        BigDecimal add = bd1.add(bd2);
        System.out.println(add); // 10.3
        BigDecimal subtract = bd1.subtract(bd2);
        System.out.println(subtract); // 9.7
        BigDecimal multiply = bd1.multiply(bd2);
        System.out.println(multiply); // 3.0
        BigDecimal divide = bd1.divide(bd2, 2, BigDecimal.ROUND_UP); // 精确几位，  舍入模式
        System.out.println(divide);


    }
}
