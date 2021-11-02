/*
* dog : eat meat    drink water
* cat :  eat fish     drink water
*
* */


package Basic3.test0_advancedStuff.dogAndCat;

// 假如类里面有抽象方法时候， 那么这个类也应该定义成抽象类。
public abstract class Animal {

    // 抽象类 不能实例化， 但是 可以有constructor
    public Animal() {

    }


    public void drink() {
        System.out.println("drink water");
    }


    // 因为 猫 和 狗 吃的不一样， 所以 应该定义为抽象方法。
    public abstract void eat();

}
