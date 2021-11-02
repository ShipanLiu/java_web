/*
* 多态的好处 和弊端
*
*
* */
package Basic3.test1_polymorpic.test3;

public class Test3 {
    public static void main(String[] args) {
        // 参数传进去一个 Dog 或者 Cat
        useAnimal(new Dog1()); // dog eat    Animal1 a = new Dog1()
        useAnimal(new Cat1()); // cat eat    Animal1 a = new Cat1()


    }

    // 这个函数的形参 可以被指定为一个 Animal1的类型，  可以接受 Animal1 下面的所有的 子类类型。
    public static void useAnimal(Animal1 a) {
        a.eat();
        // 错误， watchHome 在父类中没有， 是Dog1里面特有的。
        // a.watchHome();

        /*
        // 解决办法： 把a 向下强转一下
           Dog1 dog = (Dog1)a;
        dog.watchHome();
        // Exception in thread "main" java.lang.ClassCastException:
        // 类型转换错误： 当调用  useAnimal(new Cat1()) 的时候， 传进来的是Cat， 不能强转成狗。
         */

        // 避免 ClassCastException 错误：
        if(a instanceof Dog1) {
            // 强转一下
            Dog1 dog = (Dog1) a;
            dog.watchHome();
        }
    }
}

abstract class Animal1 {
    public abstract void eat();
}

class Cat1 extends Animal1 {
    @Override
    public void eat() {
        System.out.println("cat eat");
    }

}

class Dog1 extends Animal1 {
    @Override
    public void eat() {
        System.out.println("dog eat");
    }

    public void watchHome() {
        System.out.println("watch home");
    }
}

