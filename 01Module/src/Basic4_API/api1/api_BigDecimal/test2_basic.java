package Basic4_API.api1.api_BigDecimal;

public class test2_basic {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // 创建 Integer 类型
        Integer i1 = Integer.valueOf(200);
        Integer i2 = Integer.valueOf("300");
        System.out.println(i1 + " " + i2);


        // 也可以 自动装箱 定义
        // 对象 =？ 基本数据类型
        // 装箱： 把一个基本数据类型 变成 一个包装类。
        //  自动： java 底层会自动调用 valueof 方法。
        Integer i3 = 100;
        System.out.println(i3);

        // 自动拆箱：
        int i4 = i3;


        // 小案例：
        Integer jier = 100; // 自动装箱
        jier += 200; // jier = jier + 200
        // jier对象 -->  基本数据类型 100
        // 100 + 200 = 300;
        // 基本数据类型 -- > Integer对象， 再赋给 jier
        System.out.println(jier);


        // 细节：jiba 不能为null，
//        Integer jiba = null;



        // 成员方法：parseInt:    String ----> Integer
        String str = "10000";
        System.out.println(Integer.parseInt(str)); // 10000


        // Integer ----> String  01: + ""  02: String.valueOf

        int tem = 222;
        String s3 = String.valueOf(tem);
        System.out.println(s3);
        System.out.println(s3 instanceof String); // true


        // 小案例
        /*
        * 字符串： "91 27 46 38 50"  把其中的每个数 都存到 int 类型的数组里面。
        *
        *
        * */

         String s = "91 27 46 38 50";
         String[] strArr = s.split(" ");
         int[] intArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            int ele = Integer.parseInt(strArr[i]);
            intArr[i] = ele;
            System.out.println(ele);
        }






    }
}
