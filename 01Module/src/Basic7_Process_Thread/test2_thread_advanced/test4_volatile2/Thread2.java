package Basic7_Process_Thread.test2_thread_advanced.test4_volatile2;

public class Thread2 extends Thread{
    @Override
    public void run() {
        synchronized (Money.lock) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Money.money = 90000;
        }
    }
}
