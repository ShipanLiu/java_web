package Basic3.test0_advancedStuff.testInterface;


// interface 里面全是 abstract mathod
// 因此 interface 是不允许被创建对象的。
/*
* interface 里面的 成员变量：  系统默认final （常量全部大写）
*
* 成员方法：
*
* 构造方法：  interface 没有构造方法
*
*
* */
public interface Inter1 {


    // 01-抽象方法 系统默认加上 public abstract
    void jiba();

    // 01-抽象方法  你也可以标准地定义
    public abstract void method();

    // 02-成员属性 相当于： public static final int NUM = 10;
    int NUM = 10;

    // 03-平常的方法 interface里面也可以定义一个平常地函数, 但是需要default 修饰
    // 目的就是 为了接口升级
    public default void method2() {
        System.out.println("this is a normal method");
    }

    // 04-静态方法
    public static void staticMethod() {
        System.out.println("this is a static method from interface");
    }

}
