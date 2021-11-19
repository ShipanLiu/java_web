package Basic7_Process_Thread.test1_thread.test3_callable_future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // if t1.start(), 里面地call方法 就会执行。
        MyCallable mc = new MyCallable();

        // 创建中间件 FutureTask
        // MyCallable and  FutureTask 里面地泛型因该一致。
        // t1.start() 之后， ft  里面就是 mc 地结果
        FutureTask<String> ft = new FutureTask<>(mc);

        // create thread
        Thread t1 = new Thread(ft);
        t1.start();

        // 获取 运行结果
        // ft.get() can not be before than t1.start();
        // if the thread is not finished, then there will not be outcome for get()
        System.out.println(ft.get());


    }
}
