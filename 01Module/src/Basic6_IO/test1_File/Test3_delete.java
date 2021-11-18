package Basic6_IO.test1_File;

import java.io.File;

public class Test3_delete {
    public static void main(String[] args) {
        method1();
    }


    // 只能删除 一个文件 或者 空文件夹
    private static void method1() {
        File file = new File("C:\\jiba\\aaa\\bbb\\ccc");
        boolean res = file.delete();
        System.out.println(res);
    }
}
