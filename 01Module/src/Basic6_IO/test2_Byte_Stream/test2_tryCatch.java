package Basic6_IO.test2_Byte_Stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class test2_tryCatch {
    public static void main(String[] args) {
        // 第二个参数为 true 时候， 则 append， 否则 直接覆盖
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("C:\\jiba\\bbb.txt", true);
            fos.write('a');
            // windows 里面 换行是： /r/n  ， .getBytes() 是把string 换成 字节
            fos.write("\r\n".getBytes());
            fos.write('b');
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // finally 里面是无论如何 都要执行的代码
           // 问题是： fos 有可能是null
           if(fos != null) {
               try{
                  fos.close();
               }catch (Exception e) {
                   e.printStackTrace();
               }
           }
        }
    }
}
