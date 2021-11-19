package Basic7_Process_Thread.test1_thread.test2_runnable;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        // 下面代码就是在线程开启后 需要 干什么事情
        for (int i = 0; i < 100; i++) {
            System.out.println("thread opened" + i);
        }
    }
}
