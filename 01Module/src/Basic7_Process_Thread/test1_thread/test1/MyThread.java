package Basic7_Process_Thread.test1_thread.test1;

public class MyThread extends Thread {

    public MyThread() {

    }
    //  用来改变 thread 的名称。
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        // 下面代码就是在线程开启后 需要 干什么事情
//        for (int i = 0; i < 100; i++) {
//            System.out.println("thread opened" + i);
//        }
        // getName就是 类带有的方法
        String threadName = getName();
        System.out.println(threadName);

        System.out.println(Thread.currentThread().getName());
    }
}
