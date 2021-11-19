package Basic7_Process_Thread.test1_thread.test2_runnable;

public class Test1 {
    public static void main(String[] args) {
        // 注意 myRunnable 只是一个 参数对象。  其作用就是作为 thread 地参数
        MyRunnable mr = new MyRunnable();
        // create a thread and pass the mr into it
        Thread t1 = new Thread(mr);
        t1.start();


        // 创建第二个线程。
        MyRunnable mr2 = new MyRunnable();
        // create a thread and pass the mr into it
        Thread t2 = new Thread(mr2);
        t2.start();


        // 两个 thread 会 交替进行
    }
}
