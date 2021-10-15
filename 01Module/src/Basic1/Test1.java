package Basic1;

public class Test1 {
    //  下面是一个 main 方法
    public static void main(String[] args){
    /*
      及逆行输出
    */
        //  println 是换行
        // \t: 距离前面有一个制表符（8位）的位置
        // System.out.print("name:\t");
        // System.out.println("jier");
        // System.out.print("age");
        // System.out.print("23\n");

        // int age1 = 19, age2 = 90;
        // int age3,age4;


        /* 各种进制 */
        // int num1 = 12; //Decimal
        // System.out.println(num1);
        // int num2 = 012; // octal
        // System.out.println(num2);
        // int num3 = 0x12; // Hexa decimal
        // System.out.println(num3);
        // int num4 = 0b10; // binary
        // System.out.println(num4);

    /*
    但是 都是 十进制输出的。
      12
      10
      18
      2
    */
        //  long 要和 L 配合使用，  因为默认整数给 int。
        // long num5 = 123456789000000000L;
        // System.out.println(num5);

        //  转义字符
        char ch7 = '\n';
        System.out.println("aaa" + ch7 + "bbb");
        System.out.println("aaa\tbbb");  // 中间空5个格
        System.out.println("aaaaaa\tbbb");  // 中间空2个格
        System.out.println("aaa\bbbb"); // aabbbb   \b代表 往回退格
        System.out.println("aaa\rbbb"); // \r代表回车， 将光标回到本行的开头。  bbb把aaa 替代了。
        System.out.println("\"java\"");  // \"  代表 输出 ”   结果：  "java"
    }
}
