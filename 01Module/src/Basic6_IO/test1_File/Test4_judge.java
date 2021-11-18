package Basic6_IO.test1_File;

import java.io.File;

public class Test4_judge {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        File file = new File("C:\\jiba\\aaa.txt");
        System.out.println(file.isFile()); // true
        System.out.println(file.isDirectory()); // false
        System.out.println(file.exists()); // true
        System.out.println(file.getName());  // aaa.txt   后缀名字也会得到。
    }
}
