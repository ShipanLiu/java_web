package Basic7_Process_Thread.test2_thread_advanced.test4_volatile2;

// 加上volatile 关键字,强制每次都访问他。
public class Money {
    public static int money = 100000;

    // 第二种解决办法 ： lock
    public static Object lock = new Object();
}
