/*
* safe problem: 卖出了不存在的票 和 相同的票
*
* solutions：
*
* 02：
*
* 把 访问了 共享数据的 代码抽取到一个 方法中， 方法 修饰： synchronized
*
* */



package Basic7_Process_Thread.test1_thread.test6_solution1_Safe;

public class RunnableImpl implements Runnable {
    // 多个窗口的 共享票源
    private int ticket = 100;

    // 创建一个 锁对象
    Object obj = new Object();

    //任务是 循环卖票
    @Override
    public void run() {
        while(true) {
           synchronized (obj) {
               if(ticket > 0) {
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println("selling" + ticket + "st");
                   ticket --;
               }
           }
        }
    }
}
