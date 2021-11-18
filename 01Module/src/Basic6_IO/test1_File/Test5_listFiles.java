/*
* listFiles will return a array
*
* 会输出 包括隐藏文件 的所有文件的目录；
*
* if is a file  => return null
* if empty dic => return 0
* 
*
* */

package Basic6_IO.test1_File;

import java.io.File;

public class Test5_listFiles {
    public static void main(String[] args) {
        File file = new File("D:\\");
        File[] fileArr = file.listFiles();
        for (File file1 : fileArr) {
            System.out.println(file1);
        }
    }
}
