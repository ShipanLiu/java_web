/*

bufferInput and BufferOutput  的原理：
* 原理就是 在底层创建了一个 Byte[] byte = new Byte[8192]
*
*
* */


package Basic6_IO.test3_Buffer_Stream;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        // read buffer
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C://jiba//bbb.txt"));
        // write buffer
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("01Module//bbb.txt"));

        byte[] bytes = new byte[1024];
        int len;
        while((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bis.close();
        bos.close();
    }
}
