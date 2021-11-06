package Basic4_API.api1.api_ArrayAdvanced;

public class test4_QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quickSortV1(arr, 0, arr.length - 1);
        printArr(arr);

    }

    // 部分 quickSort 代码展示。
    public static void quickSortV1(int[] arr, int left, int right) {
        // 假如 left > right  递归马上停止。
        if(left > right) {
            return;
        }

        // 先把左右的初始位置存一下，
        int left0 = left;
        int right0 = right;

        // 先得到 基准数
        int baseNumber = arr[left0];
        // 在 两个箭头 不重合的前提下。
        while(left != right) {
            //1. 从右边找 比基数小的
            while(arr[right] >= baseNumber && right > left ) {
                right --;
            }
            //2. 从左边 找比基数大的。
            while(arr[left] <= baseNumber && right > left) {
                left ++;
            }
            //3. 交换两个位置。
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        //4. 基准数位置 换到两个箭头重合的地方。 也是一次交换
        int temp = arr[left];
        arr[left] = arr[left0];
        arr[left0] = temp;

        // 3 1 2 5 4     6     9 7 10 8
        // 现在看6 的左边：    left: 3   right: 4
        quickSortV1(arr, left0, right-1);
        // 看 6的右边
        quickSortV1(arr, left + 1 , right0);
    }


    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

