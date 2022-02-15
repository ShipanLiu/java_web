package com.atguigu.properties;

import org.junit.Test;

import java.io.*;
import java.util.Properties;

/*
*
* 主要对properties 的展示 和 如何添加 自定义的 property， 利用Properties 这个类。
*
*
* */


public class PropertiesTest {

    //  展示 System 里面 的properties
    @Test
    public void test01() {
        // 获取系统的配置信息
        Properties properties = System.getProperties();
        // 输出所有的配置信息
        properties.list(System.out);
        // get one specific property by its name
        String key = "file.encoding";
        String value = properties.getProperty(key);

        System.out.println("file.encoding: " + value);
    }



    // 我自己的 propertoies
    @Test
    public void myOwnProperties() throws IOException {
        Properties myPro = new Properties();
        myPro.setProperty("user", "root");
        myPro.setProperty("pwd", "19980223");

        System.out.println(myPro);

        // after defining the properties, we want to store it on the harddrive
        myPro.store(new FileOutputStream(new File("D://jiba.properties")), "this is a java properties test");
    }


    @Test
    public void readMyProperties() throws IOException {
        // create new property Object
        Properties readPro = new Properties();

        // load the saved properties
        readPro.load(new FileInputStream(new File("D://jiba.properties")));

        System.out.println(readPro);     // # {pwd=19980223, user=root}


    }




}
