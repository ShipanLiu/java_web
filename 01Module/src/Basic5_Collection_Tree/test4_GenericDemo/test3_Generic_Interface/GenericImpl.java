package Basic5_Collection_Tree.test4_GenericDemo.test3_Generic_Interface;
/*
* 这是一个接口的实现类
* */
public class GenericImpl<T> implements GenericInterface<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
