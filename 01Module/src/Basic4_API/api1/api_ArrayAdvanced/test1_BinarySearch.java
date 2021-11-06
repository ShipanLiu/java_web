/*
* 数组的高级操作：
*
*二分查找：     前提是先排好顺序。 比如： 【1， 2， 3， 4， 5。。。】
*
* */

package Basic4_API.api1.api_ArrayAdvanced;

public class test1_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = 3;

        int index = binarySearchForIndex(arr, num);
        System.out.println(index);
    }

    private static int binarySearchForIndex(int[] arr, int number) {
        // 定义查找的范围；
        int min = 0;
        int max = arr.length - 1;
        //循环查找, 前提条件 min <= max
        while(min <= max) {
            // 计算中间位置 mid
            // 右移一位， 相当于 除以 2
            int mid = (min + max) >> 1;
            // mid > number
            if(arr[mid] > number){
                // 表示 number 再左边
                max = mid - 1;
            } else if(arr[mid] < number) {
                //  表示 number 在右边
                min = min + 1;
            } else {
                // 这时候 表示 两者相等；
                return mid;
            }
        }
        // if can not find
        return -1;
    }
}

