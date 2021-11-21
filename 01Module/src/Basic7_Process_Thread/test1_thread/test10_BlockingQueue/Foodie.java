package Basic7_Process_Thread.test1_thread.test10_BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread {

    private ArrayBlockingQueue<String> list;

    public Foodie(ArrayBlockingQueue<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        // add apple without pause
        while(true) {
            try {
                list.take();
                System.out.println("an apple eated");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
