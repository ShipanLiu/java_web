package Basic6_IO.test1_File;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }

    // 直接把 string 变成 file类型的 string
    public static void method1() {
        String path = "C:\\jiba";
        File file = new File(path);
        System.out.println(file);  // C:\jiba
    }

    // concat two strings路径拼接
    public static void method2() {
        String path1 = "C:\\jiba";
        String path2 = "a.txt";
        File file = new File(path1, path2);
        System.out.println(file); // C:\jiba\a.txt
    }

    // concat file and a string 路径拼接
    public static void method3() {
        String path1 = "a.txt";
        File file = new File("C:\\jiba");
        File fileSum = new File(file, path1);
        System.out.println(fileSum); // C:\jiba\a.txt
    }
}
