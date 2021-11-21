/*
* safe problem: 卖出了不存在的票 和 相同的票
*
* solutions：
*
* 01：
* synchronized(锁对象) {
*
* 可能会出现安全问题的 代码
*
* }
*
* */



package Basic7_Process_Thread.test1_thread.test7_solution2_Safe;

public class RunnableImpl implements Runnable {
    // 多个窗口的 共享票源
    private int ticket = 100;


    //任务是 循环卖票
    @Override
    public void run() {
        while(true) {
               sellTicket();
        }
    }

    public synchronized void sellTicket() {
        if(ticket > 0) {
            System.out.println("selling" + ticket + "st");
            ticket --;
        }
    }
}
