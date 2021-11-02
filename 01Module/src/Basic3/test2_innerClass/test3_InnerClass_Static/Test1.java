package Basic3.test2_innerClass.test3_InnerClass_Static;

public class Test1 {
    public static void main(String[] args) {
        // 对于static innner class, wya to create instance
        Outer.Inner i = new Outer.Inner();
        i.show(); // Inner show
        // 调用static method
        Outer.Inner.staticMethod(); // this is stattic method
    }
}

class Outer {
    /*
     * 内部类 该有的 都可以有。
     * */
    static class Inner{
        int num = 10;
        public void show() {
            System.out.println("Inner show");
        }

        public static void staticMethod() {
            System.out.println("this is stattic method");
        }
    }
}

