/*
* pool 里面最多可以有多少线程。
*
* */

package Basic7_Process_Thread.test2_thread_advanced;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test2_newFixedThreadPool {
    public static void main(String[] args) throws InterruptedException {
        // 这里不是初始值，而是 pool size 是10
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName() + "执行了");
        });

        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName() + "执行了");
        });

        // 把thread pool 砸了
        executorService.shutdown();

    }
}
