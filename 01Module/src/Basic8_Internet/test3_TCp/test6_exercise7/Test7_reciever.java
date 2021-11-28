/*
* 接受发送的收据， 并且存放到 本地， 并且给 sender 反馈
*
*  代码用进程 进行封装， 为每一个客户开启一个线程。
*
* */

package Basic8_Internet.test3_TCp.test6_exercise7;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test7_reciever {
    public static void main(String[] args) throws IOException {
        // create the server socket
        ServerSocket ss = new ServerSocket(12345);

        // 创建 thread pool
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
                3,
                10,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );


        // open a thread for each cliend, listen to client and return a socket
        while(true) {
            // listen and return a socket
            Socket s = ss.accept();
            // open a new thread;
            Thread newThread = new Thread(new RunnableImplSeverThread(s));
            threadPool.submit(newThread);

            // 注意， 每一个用户都创建一个新的thread， 太浪费， 用thread pool。

        }

        //一般来说， 服务器是不关闭的。
//        ss.close();
    }
}
