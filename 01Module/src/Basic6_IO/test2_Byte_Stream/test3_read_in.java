package Basic6_IO.test2_Byte_Stream;

import java.io.FileInputStream;
import java.io.IOException;

public class test3_read_in {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // 如果文件存在： read
            // 如果文件 不存在 ： error
            fis = new FileInputStream("C://jiba//bbb.txt");
//            System.out.println(fis.read());  // 一次只会读 第一个 char   97
//            System.out.println((char)fis.read());  // 要想输出char， 需要强转

            // 注意 第二次read 是再第一次read 后面进行的。
            //  当读到末尾的时候， 读到的值是-1
            // 读取 多个 字节
            int b;
            while((b = fis.read()) != -1) {
                System.out.println((char)b);
            }

        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null) {
                try {
                    fis.close();
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
