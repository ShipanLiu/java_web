package Basic3.test0_advancedStuff.testInterface;

public class TestInterface {
    public static void main(String[] args) {
        // 通过 类名直接调用NUM， 间接说明了 NUM 被static 修饰
        System.out.println(Inter1.NUM);
        InterImp imp = new InterImp();
        // use the abstract method
        imp.method();
        // use the normal method
        imp.method2();

        // 调用静态方法, 直接用 接口 点 调用， 不能通过 实现类 点  调用
        Inter1.staticMethod();

        // use default method:
        imp.defaultMethod1();
    }
}
