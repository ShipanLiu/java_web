/*
* 这是一个泛型 类。
*
* */

package Basic5_Collection_Tree.test4_GenericDemo;

public class Generic <T>{
    // 我有一个成员变量t， 他的类型是 T类型的。
    private T t;

    // get set method
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }

    // <>  在 method 里面, 以后 创建Generic 实例时候， 就不用 《》 了。
    public <T> void show(T k) {
        System.out.println(k);
    }
}


