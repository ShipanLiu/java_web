package Basic3.test0_advancedStuff.inhirate;

public class Zi extends Fu {

    // 覆盖了 父类中的a
    int a  = 20;

    public void print() {

        // 01： 打印 Zi里面的 a
        System.out.println(this.a);
        // 02: 打印 Fu 里面的a
        System.out.println(super.a);
    }

    public void show() {
        System.out.println("子类show方法");
    }

    public void bothShow() {
        this.show(); // 调用子类show方法
        super.show();
    }

    @Override  // 注解：检查  当前方法是否是一个  正确   的重写方法
    public void normalMethod() {
    }

    // static 重写 没有 @Override 因为不是真正的重写， 而是隐藏了 父类的static方法。
    public static void staticMethod() {

    }
}
