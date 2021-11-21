package Basic7_Process_Thread.test1_thread.test9_consumer_provider;
/*
* 这里使用 thread 的第一种方法
* */


public class Consumer extends Thread {
    @Override
    public void run() {
        // 因为consumer 要一直吃汉堡
        while(true) {
            synchronized (Desk.lockObj) {
                // 判断今天的汉堡是否吃完了
                if(Desk.count == 0) {
                    // 跳出循环
                    break;
                } else{
                    // see if there is a hamburg or not
                    if(Desk.flag) {
                        // if there are， then eat
                        System.out.println("eat");
                        Desk.flag = false;
                        // inform provider to produce（唤醒 provider）
                        // 把这把锁 上多有的等待 进行 唤醒
                        Desk.lockObj.notifyAll();
                        Desk.count --;
                    } else {
                        // if not, then wait
                        // use the wait() from lock object
                        try {
                            Desk.lockObj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
