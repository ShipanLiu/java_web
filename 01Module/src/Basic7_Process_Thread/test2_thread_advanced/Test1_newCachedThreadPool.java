/*
* java 自动帮我们 创建 threadpool
*
*
* */


package Basic7_Process_Thread.test2_thread_advanced;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1_newCachedThreadPool {
    public static void main(String[] args) throws InterruptedException {
        // 创建一个默认的线程池对象， 池子中默认是空的， 默认最多可以容纳 int类型的最大值。
        // Executors ------创建 threadpool 对象
        //  ExecutorService -----帮助我们控制 threadpool
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName() + "执行了");
        });

        // 让 主线程  睡 1秒
        Thread.sleep(1000);

        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName() + "执行了");
        });

        // 把thread pool 砸了
        executorService.shutdown();


        /*
        * 运行结果：
        * pool-1-thread-1执行了
           pool-1-thread-1执行了
           *
           * 原因： thread1 执行完后 回到了pool，在执行下一次的时候， 还是用thread1 所以thread2 不会被用到。
        *
        *
        * */
    }
}
