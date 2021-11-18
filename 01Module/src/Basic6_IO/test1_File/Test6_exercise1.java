/*
* 1在当前模块下的 aaa 文件夹 中创建一个 a.txt 文件
*
* 2. 删除一个多级的文件夹
*
* 3. 统计一个文件夹中每种文件的个数， 并且打印
* 打印格式如下：
*             txt: 3个
* *           doc: 4个
* *           jpg: 6个

*定义一个变量进行 数据统计？  不行， 因为 这个变量只能统计一种文件
*
* 应该：  利用map key value 集合 进行统计：    文件后缀名：  次数
* */


package Basic6_IO.test1_File;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

public class Test6_exercise1 {
    public static void main(String[] args) throws IOException {
        // 注意 在createNewFile  时候， 要保证文件夹 是存在的。
        // 当前的 module 名字：
//        addANewFile();


        // exercise 2  删除一个文件夹
//        File src = new File("C:\\jiba\\aaa");
//        deleteDir(src);


        // exercise3 :
        File file = new File("01Module");
        HashMap<String, Integer> hm = new HashMap<>();
        getCount(hm, file);
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key + " : " + hm.get(key));
        }

    }

    private static void getCount(HashMap<String, Integer> hm, File file) {
        // 01 进入文件夹，获取所有的文件
        File[] files = file.listFiles();
        for(File f : files) {
            // if file
            if(f.isFile()) {
                String fileName = f.getName();
                // 本来 \. 表示 .   但是再java 里面 偏偏 需要两个斜杠。
                String[] fileNameArr = fileName.split("\\.");
                // 确实分成了两部分
                if(fileNameArr.length == 2) {
                    String fileEndName = fileNameArr[1];
                    if(hm.containsKey(fileEndName)) {
                        // 如果存在， 就获取次数
                        Integer count = hm.get(fileEndName);
                        count ++;
                        hm.put(fileEndName, count);
                    }else {
                        // 如果不存在， 就第一次写入。
                        hm.put(fileEndName, 1);
                    }
                }
            } else {
                // if folder
                getCount(hm, f);
            }
        }

    }

    private static void deleteDir(File src) {
        // 先删除 文件夹里面的所有内容：
        // 使用递归
        // 递归可以解决所有 文件夹 和 递归相结合 的题目：  四步走 战略
        // 01 enter --  get all the sub-files inside of this file
        File[] files = src.listFiles();

        // 02遍历 ---- 得到 src 文件夹里面 每一个文件 和 文件夹的 file 对象
        for (File file : files) {
            // 03judge-- 如果你是一个文件怎么办, 直接删除
            if(file.isFile()) {
                file.delete();
            } else{
                // 04jedge --如果是一个文件夹， 那就递归
                deleteDir(file);
            }
        }
        // 在最后再删除这个文件夹
        src.delete();
    }

    private static void addANewFile() throws IOException {
        File file = new File("01Module\\aaa");
        if(!file.exists()) {
            file.mkdirs();
        }
        File newFilePath = new File(file, "aaa.txt");
        newFilePath.createNewFile();
    }
}
