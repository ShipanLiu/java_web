/*
 * 把C盘下的一个文件 拷贝到 当前module 下
 *
 * read -》 write
 *
 *
 *
 * byteStream 很慢，  bufferStream 很牛逼
 *
 *
 *
 * */

package Basic6_IO.test2_Byte_Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test4_exercise {
    public static void main(String[] args) throws IOException {
        // read
        FileInputStream fis = new FileInputStream("C://jiba//bbb.txt");
        // write
        FileOutputStream fos = new FileOutputStream("01Module//bbb.txt");

        byte[] bytes = new byte[1024]; //  买鸡蛋的篮子
        int len; // 这次读了几个字节？
        while ((len = fis.read(bytes)) != -1) { // 把read 的值 放到 bytes 里面。
            System.out.println(len); // 12
            // 把 [ byte[0] - byte[2]) 写进去。 一次同时写两个 byte
            fos.write(bytes, 0, len);
        }
        fis.close();
        fos.close();
    }
}

/*
 * 原理： 假如 设置Byte【2】
 *
 * 一次 读两个字节，存储到 byte 里面。    write 进去 到目的地。 这时候 len 就是2
 *
 * 假如最后一次， 只剩下一个字节， 则 只读一个字节，  这时候len是1.
 *
 * */
