/*
 *   位置： 在方法中编写
 *    访问方式：  只能在方法中， 创建对象访问。
 * */

package Basic3.test2_innerClass.test4_innerClass_Local;

public class Test1 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();

    }
}

class Outer {

    // 成员方法 of Outer
    public void method() {
        class Inner{
            public void show() {
                System.out.println("show from the local inner class");
            }
        }

        Inner i = new Inner();
        i.show();
    }
}
