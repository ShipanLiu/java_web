/*
* 批量 添加 一万条数据
*
*
* */


package com.atguigu.jdbctest02;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test02_addData {

    // 批量添加数据。
    @Test
    public void addData() throws ClassNotFoundException, SQLException {

        // the start time
        long startTime = System.currentTimeMillis();

        // register the driver
        Class.forName("com.mysql.jdbc.Driver");

        // create connection(打开 batch 批次处理功能)
        String url = "jdbc:mysql://192.168.233.132:3306/atguigu_test01?rewriteBatchedStatements=true";
        String user = "root";
        String pwd = "19980223";
        Connection connection = DriverManager.getConnection(url, user, pwd);
        // sql

        String sql = "INSERT INTO users VALUES(null, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(sql);

        // insert 1000 terms
        for(int i = 0; i < 10000; i++) {
            ps.setObject(1, "libai"+i);
            ps.setObject(2,"pwd"+i);
            ps.addBatch();
            // 假如插入一百万条 ， 每 5000 次 干一次
            if(i % 5000 == 0) {
                ps.executeBatch();
                // clear the batch
                ps.clearBatch();
            }

        }
        ps.executeBatch();


        // result
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);   // 一万条数据 1031 ms
        // close

        ps.close();
        connection.close();
    }



}
