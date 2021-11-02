/*
* 静态代码块。
* 通过static关键字进行修饰。 随着 类的加载 而加载。   并且只执行一次。
* 作用： 在类加载的时候， 做一些数据初始花的操作。
*
* */


package Basic3.test0_advancedStuff.codeBlock;

public class inStatic {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
    }
}

class Person {
//    作用 在一启动的时候， 就带有一些初始化的数据
    static {
        System.out.println("我是静态代码块， 我执行了, 只执行一次 。");
    }

    public Person() {
        System.out.println(" no params constructor");
    }

    public Person(int a) {
        System.out.println(" with params constructor");
    }
}
