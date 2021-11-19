package Basic7_Process_Thread.test1_thread;

public class Test4_sleep {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("jiba");

            // 利用thread 的sleep 功能。 sleep 1000毫秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
