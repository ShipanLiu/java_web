package com.atguigu.druid;


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;

import java.sql.SQLException;

/*
* Druid 数据库连接池 技术 。from ali
*
* */
public class DruidTest {

    @Test
    public void test01() throws SQLException {
        // 01 import jar package
        // 02 create the object
        DruidDataSource ds = new DruidDataSource();
        // 03 config
          // basic config
        ds.setUsername("root");
        ds.setPassword("19980223");
        ds.setUrl("jdbc:mysql://192.168.233.132:3306/atguigu_test01");
        ds.setDriverClassName("com.mysql.jdbc.Driver");

         // coonnection pool set up
        ds.setInitialSize(5);  // 初始化 再池子里的 connection 的数量。
        ds.setMaxActive(10);
        ds.setMaxWait(2000);  //  最多等待 2000ms

        // 04 get connection
//        DruidPooledConnection connection = ds.getConnection();
//        System.out.println(connection);

        // for test we create 20 connections
        for(int i = 0; i < 20; i++) {
            DruidPooledConnection connection = ds.getConnection();
            System.out.println("connection" + i + " : " + connection);
            connection.close();
        }

        //  the result is : for all these 20 connection requests, only one connection is busy with them,, others are
        // resting.

        // ****problem****   : hard connection, deswegen we need also a properties file for druid connectiom pool.

    }
}
