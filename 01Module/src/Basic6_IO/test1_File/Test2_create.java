/*
*
* 只是用 mkdirs 就可以了
*
* */


package Basic6_IO.test1_File;

import java.io.File;
import java.io.IOException;

public class Test2_create {
    public static void main(String[] args) throws IOException {
        m2();
        m3();
    }

    // 文件存在 result false；
    // 只能创建 文件
    public static void m1() throws IOException {
        File file1 = new File("C:\\jiba\\aaa.txt");
        boolean result = file1.createNewFile();
        System.out.println(result);
    }

    // 只能创建 单极文件夹。
    public static void m2() throws IOException {
        File file1 = new File("C:\\jiba\\aaa");
        boolean result = file1.mkdir();
        System.out.println(result);
    }

    public static void m3() throws IOException {
        File file1 = new File("C:\\jiba\\aaa\\bbb\\ccc");
        boolean result = file1.mkdirs();
        System.out.println(result);
    }

}
