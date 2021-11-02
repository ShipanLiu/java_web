/*
* 多态成员的访问特点：
*
* 在这个IDE里面， 编译是一步， 运行也是一步。
*
*   成员变量： 编译看左边（父类）， 运行看左边（父类）  因为 成员变量没有重写， 所以看的还是父类
*
*   成员方法： 编译看左边（父类）， 运行看右边（子类） 因为方法有重写
*
*
*
*
* */

package Basic3.test1_polymorpic.test2;

public class Test2 {
    public static void main(String[] args) {
        // 满足多态的第三个条件。
        Fu fu = new Zi();
        System.out.println(fu.num); // 10  执行 Fu 里面的num
        fu.method(); // Zi   执行 Zi 里面的method
    }
}

class Fu {
    int num = 10;

    public void method() {
        System.out.println("Father");
    }
}

class Zi extends Fu {
    int num = 20;

    @Override
    public void method() {
        System.out.println("Zi");
    }
}
