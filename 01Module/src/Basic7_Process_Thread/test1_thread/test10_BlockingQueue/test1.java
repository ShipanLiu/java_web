package Basic7_Process_Thread.test1_thread.test10_BlockingQueue;

import java.awt.*;
import java.util.concurrent.ArrayBlockingQueue;

public class test1 {
    public static void main(String[] args) throws InterruptedException {
        //  创建堵塞队列， 容量为1
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(1);

        // put 储存
        arrayBlockingQueue.put("jiba");

        // get
        System.out.println(arrayBlockingQueue.take());
        System.out.println(arrayBlockingQueue.take());
        // 第二个啊 取不到， 会等待
        System.out.println("不会打印出");
    }
}
