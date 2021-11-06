package Basic4_API.api1.api_Exception;

import com.sun.tools.jconsole.JConsoleContext;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = null;
        try {
            printArr(arr);
            // 有多个异常 就写多个catch， 不同的异常 处理 方式可能不一样。
        } catch (NullPointerException e) {
            System.out.println("出错了");
            // getMessage  方法
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
