package Basic6_IO.test02_Byte_Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test1_write_out {
    public static void main(String[] args) throws IOException {
        // 01 创建 byte stream 对象 ---- 告诉虚拟机 要向哪一个文件中 写数据了。
        // 注意点： 如果文件不存在 就会 创建文件
        // 如果文件 存在，就会把文件  清空。
        FileOutputStream fos = new FileOutputStream("C:\\jiba\\aaa.txt");
        // 2. write data
        // 97 是对应的ASCII 里面的a
        fos.write(97);




        // 写入多个byte
        byte[] byteArr = {97, 98, 99, 100};
        fos.write(byteArr);

        // where start? and the length
        fos.write(byteArr, 1, 2);


        // 3. close stream， 释放资源
        fos.close();
    }
}
