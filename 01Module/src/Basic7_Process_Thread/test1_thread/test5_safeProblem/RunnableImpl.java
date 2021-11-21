package Basic7_Process_Thread.test1_thread.test5_safeProblem;

public class RunnableImpl implements Runnable {
    // 多个窗口的 共享票源
    private int ticket = 100;


    //任务是 循环卖票
    @Override
    public void run() {
        while(true) {
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
