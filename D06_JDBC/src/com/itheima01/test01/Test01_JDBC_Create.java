package com.itheima01.test01;

import java.sql.*;

public class Test01_JDBC_Create {
    public static void main(String[] args) throws Exception {
        //1.导入jar包（jar包必须 包括到 library）
        //2.注册驱动 once class Driver is used, the static block (imside of the Driver class)will be used for
        // registering the Driver
        // mysql5之后， 这一步可以省略
        // Class.forName("com.mysql.jdbc.Driver");
        //3.获取链接
        Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.233.132:3306/test04", "root", "19980223");
        //4.获取执行者对象(this is for executing the sql)
        Statement statement = connection.createStatement();
        //5.执行sql语句， 并且接受结果
        String sql = "SELECT * FROM orderlist";
        ResultSet rs = statement.executeQuery(sql);
        //6.处理结果
        while(rs.next()) {
            System.out.println(rs.getInt("id") + "\t" + rs.getString("number"));
        }

        //7.释放资源
        connection.close();
        statement.close();
    }
}
