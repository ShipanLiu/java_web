/*
 * 匿名内部类的 条件：
 *
 * 需要存在 一个类， 或者接口。
 *
 * */

package Basic3.test2_innerClass.test5_innerClass_anonymous.test1;

public class test1 {

    public static void main(String[] args) {
        InterImp ii = new InterImp();
        ii.show();

        // 你看， 简化了接口内方法的调用 。
//        new Inter() {
//            @Override
//            public void show() {
//                System.out.println("匿名类");
//            }
//        }.show();

        // 匿名内部类的理解： 将 extends / inplements，方法重写， 创建对象 ， 放在了一步进行。
        // 创建 Inter的实现类。 一般是 Inter inter = new Inter(),  但是这里没有 name.
        new Inter() {
            // 重写 类里面的方法。
            @Override
            public void show() {
                System.out.println("匿名类");
            }
        }.show(); // 整体instance 调用show 方法

        /*
        * 假如一个 接口里面 有两个方法， 可以这样使用。
        *
        * */
        // 接口2 的实现类 的 instance 指向 了 父类i， 所以是向上引用， 多态
        Inter2 i = new Inter2() {
            @Override
            public void show1() {
                System.out.println("this is show 1");
            }

            @Override
            public void show2() {
                System.out.println("this is show 2");
             }
        };

        i.show1();
        i.show2();
    }
}


interface Inter {
    // public abstract 会自动被 补上
    void show();
}

interface Inter2 {
    void show1();
    public abstract void show2();
}

class InterImp implements Inter {
    @Override
    public void show() {
        System.out.println("override the show method");
    }
}
