/*
* 这一次 自己创建 threadpool
*
*
* */

package Basic7_Process_Thread.test2_thread_advanced;

import java.util.concurrent.*;

public class Test3_MyThreadPool {
    public static void main(String[] args) {
        /*
         * 自己创建 threadpool， ThreadPoolExecutor（）  里面的参数
         *
         * 核心thread数量
         * 最大线程数
         * 空闲线程最大存活时间
         * 时间单位
         * 堵塞任务队列
         * 创建线程工厂（用来创建线程）
         *任务的拒绝策略
         * */
        ThreadPoolExecutor myPool = new ThreadPoolExecutor(
                1,
                5,
                2,
                TimeUnit.SECONDS,  //枚举单位
                new ArrayBlockingQueue<>(10), // 最多接受十个顾客 在外面等着
                Executors.defaultThreadFactory(), // create thread by by default way
                new ThreadPoolExecutor.AbortPolicy()); // 当 task amount > thread amount in pool + blocking queue
        // 传统创建线程 方式
        myPool.submit(new MyRunnable());
        // 用lmbada的方式
        myPool.submit(() -> {
            System.out.println("jiba");
        });

        myPool.shutdown();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }
}
