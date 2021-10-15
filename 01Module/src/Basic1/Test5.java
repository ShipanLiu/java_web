package Basic1;

/*
 *  method and method are brothers
 *
 *
 * */
public class Test5 {
    public static void main(String[] args) {
//        eat();
//        check();
//        check1();
        arrayCheck();
    }

//    public static void eat() {
//        System.out.println("eat something");
//    }
//
//    // create a method and input a number and check if it is odd or even
//
//    public static void check() {
//        int num  = 10;
//        if(num % 2 == 0) {
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//        }
//    }


    // 方法参数传递， 基本数据类型
    public static void check1() {
        int num = 1;
        System.out.println("davor: " + num);  // 1
        change(num);
        System.out.println("danach: " + num);  // 1

    }

    public static void change(int number) {
        number = 2;
    }

    // 方法参数传递， 引用数据类型。

    public static void arrayCheck() {
        int[] arr = {1, 2, 3};
        System.out.println("dovor: " + arr[0]); // 1
        arrayChange(arr);
        System.out.println("danach: " + arr[0]); //100
    }

    public static void arrayChange(int[] arr) {
        arr[0] = 100;
    }


}
