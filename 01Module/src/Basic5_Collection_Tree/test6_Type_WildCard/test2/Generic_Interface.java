/*
* 泛型 接口。   就是 Interface 用 到泛型。
*

* */



package Basic5_Collection_Tree.test6_Type_WildCard.test2;

public class Generic_Interface {
    public static void main(String[] args) {
        GenericityImp1<String> g = new GenericityImp1<>();
        g.method("jibe");

        GenericityImp2 g2 = new GenericityImp2();
        g2.method(30);

    }
}


// 编写interface的实现类：
// 一种是 在实现类里面也不确定类型 T， 将T延续下去
// 一种是 在实现类里面就确定好 T

// the first implement method
class GenericityImp1<E> implements Genericity<E> {
    @Override
    public void method(E e) {
        System.out.println(e);
    }
}

// the second imp method, give the type
class GenericityImp2 implements Genericity<Integer> {
    @Override
    public void method(Integer e) {
        System.out.println(e);
    }
}


interface Genericity<E> {
    public abstract void method(E e);
}



