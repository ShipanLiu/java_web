package Basic7_Process_Thread.test1_thread.test5_safeProblem;

// 模拟三个窗口（线程） 买票
public class Test1 {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);

        t1.start();
        t2.start();
        t3.start();

        /*
        * 问题： 两个 窗口卖 同一张票
        *原因： 三个线程一起抢夺cpu的执行权 票
        *
        * 当票数为0 时候， 其他两个线程 可能继续， 于是就出现了 0 和-1 甚至-2
        *solutions： 保证 在一个线程 有 cpu的执行权的时候， 其他线程等待。
        *
        *
        * */

    }
}
