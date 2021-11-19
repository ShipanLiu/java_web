

/*
* 两个thread 会随机交替 执行
*
* main 是主线程
*Thread-0 是一个线程
*
*
* */
package Basic7_Process_Thread.test1_thread.test1;

public class Test1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread("dan");
        // 改变线程 名称
        t1.setName("jiba");
        // start 方法 才是真正开启了 线程
//        t1.start();
//        t2.start();
        /*
        * run方法 相当于普通地调用。
        * */
//         t1.run();
        t1.start();
        t2.start();
    }
}
