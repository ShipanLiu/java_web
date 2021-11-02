package Basic3.test0_advancedStuff.inhirate;

public class Fu {
    int a = 10;

    public void show() {
        System.out.println("父类show方法");
    }

    // 子类要想 overwrite 父类的static 方法， 也要static

    public void normalMethod() {

    }

    public static void staticMethod() {

    }
}
