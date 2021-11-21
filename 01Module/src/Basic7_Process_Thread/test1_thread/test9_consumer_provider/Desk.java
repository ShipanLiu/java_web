package Basic7_Process_Thread.test1_thread.test9_consumer_provider;

public class Desk {
    // Desk 是存放食物的地方：
    // true： consumer could eat
    // false: consumer have to wait, provider do
    public static boolean flag = false;

    // 今天一共做的汉堡包的数量
    public static int count = 10;

    // provider 和 consumer 公用的 锁对象
    public static final Object lockObj = new Object();

}
