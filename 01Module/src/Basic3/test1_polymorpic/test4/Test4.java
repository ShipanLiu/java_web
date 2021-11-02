/*
* 向上转型
*
* 向下转型
*
*
* */
package Basic3.test1_polymorpic.test4;

public class Test4 {
    public static void main(String[] args) {
        // 向上转型： 把原来的 Zi 对象 提升为 Fu 类型
        Fu f = new Zi();
        // 调用 公有的show方法 没问题
        f.show();
        // 调用 Zi 特有的 method 方法 有问题 , 这是多态的 弊端（但是 一般多态 只会调用公有的 方法）
        //f.method()

        // 假如非要调用 子类特有的方法    way1： 直接创建子类对象   way2： 向下转型。
        // 向下转型： 从 父类 类型， 转换到 子类 类型。
        // f 算大的， 大的 赋给 小的， 需要强制类型转换
        Zi zi = (Zi)f;
        zi.method(); // here is particular method from Zi




    }
}

class Fu {
    int num = 10;
    public void show() {
        System.out.println("fu show");
    }
}

class Zi extends Fu {
    int num = 20;

    @Override
    public void show() {
        System.out.println("Zi-show");
    }

    public void method() {
        System.out.println("here is particular method from Zi");
    }
}
