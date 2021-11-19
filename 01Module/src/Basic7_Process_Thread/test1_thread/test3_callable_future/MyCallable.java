package Basic7_Process_Thread.test1_thread.test3_callable_future;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("每天练习" + 1 );
        }
        return "good job";
    }
}
