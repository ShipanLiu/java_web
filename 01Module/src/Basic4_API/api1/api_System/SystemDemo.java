package Basic4_API.api1.api_System;

public class SystemDemo {
    public static void main(String[] args) {
//        System.out.println("jier1");
        //  非 0 数 表示 异常终止
//        System.exit(0);
//        System.out.println("jier2");

        // 当前的 时间 （ms）
        long start = System.currentTimeMillis();
        System.out.println("jier");
        long end = System.currentTimeMillis();
        System.out.println(end - start);  // 1ms


        // arraycopy:  数组拷贝
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[10];

        // 不再需要for 循环了。
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        System.out.println(arr2);
    }

}
