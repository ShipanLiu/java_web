package Basic4_API.api1.api_ArrayAdvanced;

import java.util.Arrays;

public class test5_Arrays_API {
    public static void main(String[] args) {
        // toString
        int[] arr = {3, 2, 1, 4, 5};
        System.out.println(Arrays.toString(arr));  // [3, 2, 1, 4, 5]

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));  // [1, 2, 3, 4, 5]

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int index = Arrays.binarySearch(arr1, 8);
        System.out.println(index); // 7

        /*
        * 注意： 提前排好顺序，
        * 假如search 的不存在， 返回 -插入点-1
        *
        *
        * */

        System.out.println(Arrays.binarySearch(arr1, 9)); // -9
    }
}
