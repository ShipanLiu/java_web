package com.atguigu.jdbctest01;

import org.junit.Test;

import java.sql.*;

public class Test02_find {

    @Test
    public void query() throws SQLException {

        String url = "jdbc:mysql://192.168.233.132:3306/atguigu_test01";
        String user = "root";
        String pwd = "19980223";
        Connection connection = DriverManager.getConnection(url, user, pwd);

        String sql = "SELECT * FROM users";
        // get statement
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);  // we get :  [{}, {}, {}]

        // 遍历这个set， 得出结果
        while(resultSet.next()) {
           /*int id =  resultSet.getInt("id");
           String sname = resultSet.getString("sname");
           String password = resultSet.getString("pwd");*/
            // 我只关心 值。  deswegen benutze Object
            Object id =  resultSet.getObject("id");
            Object sname = resultSet.getObject("sname");
            Object password = resultSet.getObject("pwd");

            System.out.println("id:" + id + "  " + "sname: " + sname + "  " + "pwd: " + password);
        }

        connection.close();
        statement.close();
    }

}
