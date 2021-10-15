/*
* 进制转换
*数组反转
*
*
* */



package Basic1;

public class Test6 {
    public static void main(String[] args) {
//        baseConversion();
        arrayConvert();
    }


    public static void baseConversion() {
        System.out.println(10); // 10
        System.out.println(0b10); // 2
        System.out.println(010); // 8  octal
        System.out.println(0x10); // 16
    }

    public static void arrayConvert() {
        int[] arr = {1, 2, 3, 4, 5};
        int start = 0;
        int end = arr.length - 1;
        for(;start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
