/*
* 多态的前提：
* 1. 要有 继承/实现 关系
* 2. 要有方法的重写
* 3. 要有父类引用， 指向子类对象。
*
* */

package Basic3.test1_polymorpic.test1;

public class Test1 {
    public static void main(String[] args) {
        // 要有父类引用， 指向子类对象
        // 当前事物， 是一只动物。
        Animal a = new Cat();

        // 当前事物， 是一只猫
        Cat c = new Cat();
    }
}

class Animal {
    public void eat() {
        System.out.println("animal eat");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("cat eat");
    }
}
