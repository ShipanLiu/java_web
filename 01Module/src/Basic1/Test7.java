/*
* 二维数组
*
*
* */



package Basic1;

public class Test7 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(arr[1][2]); // 6

        iterateArray();
    }

    // Iterate over the array ==》  iterate the 1.demension arrat and then the 2. dimmension array
    public static void iterateArray() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
    }

}
