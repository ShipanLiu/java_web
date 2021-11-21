package Basic7_Process_Thread.test1_thread.test9_consumer_provider;


public class Test1 {
    public static void main(String[] args) {
        // 创建两个线程的对象
        Provider runnableImpl = new Provider();
        Consumer t1 = new Consumer();
        Thread t2 = new Thread(runnableImpl);

        t1.start();
        t2.start();

        /*
        * producing
            eat
            producing
            eat
            producing
            eat
            producing
            eat
            producing
            eat
            producing
            eat
            producing
            eat
            producing
            eat
            producing
            eat
            producing
            eat
        *
        *
        * */
    }
}
