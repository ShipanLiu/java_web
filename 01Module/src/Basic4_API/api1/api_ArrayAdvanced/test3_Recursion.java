/*
* get the sum 1...100.
*
*
* 递归球阶乘 ： factorial
*
* 找到出口：    当 参数等于多少的时候， 就步调用自己了。。。
* 递归的规则， 调用自己。  方法再次调用自己的时候， 一定会 比上次更加靠近出口。
*
* */


package Basic4_API.api1.api_ArrayAdvanced;

public class test3_Recursion {
    public static void main(String[] args) {
        int sum = getSum(2);
        System.out.println(sum);

        int myFactorial = getFactorial(3);
        System.out.println(myFactorial);
    }

    // 递归求和
    private static int getSum(int i) {
        // 递归的出口。
        if(i == 1) {
            return 1;
        } else {
            // 方法再次调用自己的时候， 一定会 比上次更加靠近出口。
            return i + getSum(i - 1);
        }
    }

    // 递归求阶乘

    private static int getFactorial(int i) {
        // 递归的出口。 1! = 1
        if(i == 1) {
            return 1;
        } else {
            return i * getFactorial(i - 1);
        }
    }
}
