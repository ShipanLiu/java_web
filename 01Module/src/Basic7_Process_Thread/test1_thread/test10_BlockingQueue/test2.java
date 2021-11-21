package Basic7_Process_Thread.test1_thread.test10_BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;

public class test2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> list = new ArrayBlockingQueue<>(1);

        // create the threads
        Foodie foodie = new Foodie(list);
        Cooker cooker = new Cooker(list);

        // start the threads

        foodie.start();
        cooker.start();

    }
}
