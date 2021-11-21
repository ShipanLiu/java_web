/*
* ArrayBlockingQueue  方法的底层已经有lock了， 直接用
* */

package Basic7_Process_Thread.test1_thread.test10_BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Cooker extends Thread {
    private ArrayBlockingQueue list;

    public Cooker(ArrayBlockingQueue<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            try {
                list.put("apple");
                // 这个输出语句是 自己定义的， 可能打印混乱
                System.out.println("an apple added");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
