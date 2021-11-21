/*
*
* 死锁：
*
* */

package Basic7_Process_Thread.test1_thread.test8_dead_Lock;

public class Test1 {
    public static void main(String[] args) {
        // 创建两个锁对象：
        Object obj1 = new Object();
        Object obj2 = new Object();

        // 创建两个 runnable 的 thread
        new Thread(
                () -> {
                    synchronized (obj1) {
                        synchronized (obj2) {
                            System.out.println("jiba");
                        }
                    }
                }
        ).start();

        new Thread(
                () -> {
                    synchronized (obj2) {
                        synchronized (obj1) {
                            System.out.println("dan");
                        }
                    }
                }
        ).start();
    }
}
