package Basic3.test0_advancedStuff.static_keyword;

public class TestStatic {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "jier";
        stu1.age = 23;
        stu1.school = "RUB";
        Student stu2 = new Student();
        stu1.show();
        stu2.show(); // 虽然没赋值， 但是 ：null....0....RUB

        System.out.println("*****************************");
        Student.school = "TU Dortmund"; // 通过 类.属性 来访问
        stu1.show(); // jier....23....TU Dortmund

        /*
        * 被static修饰的成员， 会被该类的所有对象共享。（既然这样， 就直接  用类 点 赋值 就行了。   比如 Student.school = "TU Dortmund"）
        *被static修饰的成员， 会随着类的加载而加载， 优先于对象存在。
        * 这个static string school 会 随着类的字节码文件 加载而加载的。
        * 而且可以在创建对象 之前  使用。
        *比如：
        * Student.school = "TU Berlin";
        * Student stu = new Student();
        *
        *
        *
        *多了一种调用方式，可通过类名进行调用。
        * */
        myMethod();

    }

    /*
    * 这就是为什么 在psvm 下面要写 public static void myMethod(){}
    * 因为在psvm 本事是static， 只有你歇成static， 才允许被psvm 调用。
    *
    * */

    private static void myMethod(){
        System.out.println("jier");
    }


}
