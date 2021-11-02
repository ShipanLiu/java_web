package Basic1;
/*
 数据类型的转化

int 会专车给double， 但是 double 不会转成 int， 会损失。

Ranking: byte(1), short(2), char(2) => int(4) => long(8) => float(4) => double(8)

*/
// 把 Scanner 从 Java。util 包里面拿出俩
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {

   /*  //  自动类型转换
    double d = 6;  //   把int 类型 6 给了 d
    System.out.println(d);  // 6.0  会自动类型转换

    // fForced type conversion
    int i = (int)6.5;
    System.out.println(i);  // 6

    //  special situation， 对于 byte， char， short， 只要在 其表数范围内， 就不需要force convert
    //  example:   byte:  -128 - 127
    byte b = 12;
    System.out.println(b); // 12

    byte k = (byte)270;  // 14
    System.out.println(k); */


        //  finial 的用法： 以后这个 值 就不会 被改变了。   Character constant  要大写。

    /* final double PI = 3.14;

    //  扫描器 来 录入值
    Scanner sc = new Scanner(System.in);
    System.out.print("please enter a num: ");
    int r = sc.nextInt();

    System.out.println(r * PI); */


        //  运算符开始。


    /*
    System.out.println(12/3); //4
    System.out.println(12%5); // 2
    System.out.println(12/3.0); // 4.0
    System.out.println(12%5.0); // 2.0
    */

        // 实现功能：  任意给出一个四位数， 求出每位上的数字。

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a 4-bits number");
        int num = sc.nextInt();

        System.out.println(num%10);
        System.out.println(num/10%10);
        System.out.println(num/100%10);
        System.out.println(num/1000);



    }
}
