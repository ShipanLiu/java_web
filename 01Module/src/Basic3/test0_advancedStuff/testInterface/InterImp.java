/*
* 因为 interface 不能实例化， 需要一个实现类
*
* implements 相当于 extends， 但是 implements 可以 连接多个接口
*
* */

package Basic3.test0_advancedStuff.testInterface;

public class InterImp implements Inter1, Inter2 {

    public InterImp() {
        // super访问的是Object， 而不是 Inter1.
        super();
    }

    @Override
    public void jiba() {

    }

    @Override
    public void method() {
        System.out.println("我是 实现类 中的 重写方法");
    }

    @Override
    public void print1() {

    }

    @Override
    public void print2() {

    }

    public void print3() {

    }
}
