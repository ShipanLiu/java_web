package com.atguigu.jdbctest02;

import org.junit.Test;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class Test01_sovle_sql {


    // 解决 sql 的注入的问题。
    @Test
    public void solveSqlProblem () throws SQLException, ClassNotFoundException {
        // 输入名字 和pwd
        System.out.println("username input");
        Scanner sc = new Scanner(System.in);
        String inputName = sc.next(); // get rid of the space
        System.out.println("pwd input");
        String inputPwd = sc.next(); // get rid of the space

        // register the driver
        Class.forName("com.mysql.jdbc.Driver");

        // create connection
        String url = "jdbc:mysql://192.168.233.132:3306/atguigu_test01";
        String user = "root";
        String pwd = "19980223";
        Connection connection = DriverManager.getConnection(url, user, pwd);
        // create sql
        String sql = "INSERT INTO users VALUES(null, ?, ?)";
        // create statement and execute teh sql
        PreparedStatement preparedstatement = connection.prepareStatement(sql);

        // 把两个问号的内容填充进去
        preparedstatement.setObject(1, "jibadan");
        preparedstatement.setObject(2, "10000");

        // execute thr sql
        int i = preparedstatement.executeUpdate();

        // get the result
        System.out.println(i);

        // release the resource
        preparedstatement.close();
        connection.close();
    }


    // 插入图片 用blob
    @Test
    public void photoBlob() throws ClassNotFoundException, SQLException, IOException {
        // register the driver
        Class.forName("com.mysql.jdbc.Driver");

        // create connection
        String url = "jdbc:mysql://192.168.233.132:3306/atguigu_test01";
        String user = "root";
        String pwd = "19980223";
        Connection connection = DriverManager.getConnection(url, user, pwd);

        String sql = "insert into photo values(null, ?)";
        PreparedStatement ps = connection.prepareStatement(sql);

        // add a photo(max 64 kb)
        InputStream inputStream = new FileInputStream(new File("C:\\Users\\user\\Desktop\\photos_shipan\\english.png"));
        ps.setObject(1,inputStream);
        // execute the sql
        int i = ps.executeUpdate();
        System.out.println(i);
        ps.close();
        connection.close();
        inputStream.close();
    }

    // 获取自动增长的 键值。
    @Test
    public void getAutoIncreaseId() throws ClassNotFoundException, SQLException, IOException {
        // register the driver
        Class.forName("com.mysql.jdbc.Driver");

        // create connection
        String url = "jdbc:mysql://192.168.233.132:3306/atguigu_test01";
        String user = "root";
        String pwd = "19980223";
        Connection connection = DriverManager.getConnection(url, user, pwd);

        String sql = "insert into users values(null, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        ps.setObject(1, "beijing");
        ps.setObject(2, "2022");
        // execute the sql
        int i = ps.executeUpdate();
        System.out.println(i > 0 ? "success" : "failed");

        // get the generated id
        ResultSet generatedKeys = ps.getGeneratedKeys();
        while(generatedKeys.next()) {
            System.out.println(generatedKeys.getObject(1));
        }
        ps.close();
        connection.close();
    }
}
