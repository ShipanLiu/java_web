package Basic7_Process_Thread.test2_thread_advanced.test4_volatile1;

public class Thread1 extends Thread{
    @Override
    public void run() {
        while(Money.money == 100000) {

        }
        System.out.println("结婚基金已经不是10万了");
    }
}
