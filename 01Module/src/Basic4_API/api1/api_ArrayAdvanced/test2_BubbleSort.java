package Basic4_API.api1.api_ArrayAdvanced;

public class test2_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 1, 4};

        // -1 是为了让 index 不要越界
        // -i 是为了 每一轮结束之后，  就会少比 一个数字。
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArr(arr);
    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
