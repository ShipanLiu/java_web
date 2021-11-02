package Basic3.test2_innerClass.test1_InnerCalss;

public class Test1 {
    public static void main(String[] args) {
        //  create instance of inner class
        //  不可以， 因为Inner peivate 了。
//        Outer.Inner i = new Outer().new Inner();
        Outer o = new Outer();
        o.method();  // Inner show
    }
}

class Outer {
    /*
     * 内部类 该有的 都可以有。a
     * */
    private class Inner{
        int num = 10;
        public void show() {
            System.out.println("Inner show");
        }
    }

    // 因为 Inner 是private， 所以其他的 类访问不到, 解决办法
    public void method() {
        Inner i = new Inner();
        i.show();
    }

}

