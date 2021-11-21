package Basic7_Process_Thread.test1_thread.test9_consumer_provider;

public class Provider implements Runnable{
    @Override
    public void run() {
        while(true) {
            synchronized (Desk.lockObj) {
                if(Desk.count == 0) {
                    break;
                } else{
                    if(!Desk.flag) {
                        // produce
                        System.out.println("producing");
                        Desk.flag = true;
                        Desk.lockObj.notifyAll();

                    } else {
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
