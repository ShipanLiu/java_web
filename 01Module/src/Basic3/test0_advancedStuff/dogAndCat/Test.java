/*
* 测试抽象类的方法
*
* Animal 类 不能创建instance （创建实例）
*
* */


package Basic3.test0_advancedStuff.dogAndCat;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        Cat cat = new Cat();
        cat.eat();
    }

}
