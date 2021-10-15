package Basic1;

public class Test4 {
    public static void main(String[] args) {
        /*random*/
//        Random r = new Random();
//        System.out.println(r.nextInt(10));

        /*Array, 必须初始化， 然后才能使用。*/
//        int[] arr: create a int type array, name is arr
//        new int[5] : 在内存开辟int类型的空间
//        int[] arr = new int[5];
//        System.out.println(arr);  // [I@1cd072a9  这叫数组的内存地址， 时为了正确地找到这块空间
//
//        byte[] bArr = new byte[3];
//        System.out.println(bArr); // [B@7c75222b
//
//        System.out.println(arr[0]); // 0  the default value while initializing
//        System.out.println(arr[1]); // 0
//
//        System.out.println(bArr[0]); // 0

        /*静态方法初始化数组*/

        int[] arr1 = new int[]{11, 22, 33, 44};

        int[] arr2 = {55, 66}; // 系统会自动变成  new int[] {55, 66}

        System.out.println(arr2[0]);


        /*  Method */




    }
}
