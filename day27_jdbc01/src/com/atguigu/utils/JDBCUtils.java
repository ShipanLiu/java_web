package com.atguigu.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;



/*
* 数据库 连接 和报错  大量代码重复， 因此抽到 一个方法 里面。

*this version does not use the   connection pool technology (see the second version)
*
* */


public class JDBCUtils {

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        sqlConnection();
    }

    static String user;
    static String pwd;
    static String url;
    static String driver;

    //  因为有 inputStream， 我们想要只 一次。  因此使用静态代码块。
    // 只要类一被加载， static block 就对自动调用。
    static {
        // 01 create a property Object
        Properties mysqlPro = new Properties();
        // 02 load the properties(相对路径, 注意一定要再src 文件夹下面。)
        try {
            mysqlPro.load(JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties"));
            // 02 绝对路径 load
//        mysqlPro.load(new FileInputStream((new File("H:\\JAVA\\project\\Basic\\day27_jdbc01\\jdbc.properties"))));

            user = mysqlPro.getProperty("user");
            pwd = mysqlPro.getProperty("pwd");
            url = mysqlPro.getProperty("url");
            driver = mysqlPro.getProperty("driver");

            // 进行连接 sql 的服务器
            Class.forName(driver);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }



    }

    // 连接数据库(with a properties file)
    public static Connection sqlConnection() throws ClassNotFoundException, SQLException, IOException {

        // I use static block, all the conenction,  need only load once.  because the data is lready
        // saved in the static String after once load.
        Connection connection = DriverManager.getConnection(url, user, pwd);
        System.out.println("connection 666");
        return connection;
    }



    // close Resource(static的话， 就可以直接用类名 点 来调用)
    public static void closeResources(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {
        if(connection != null) {
            connection.close();
        }

        if(statement != null) {
            statement.close();
        }

        if(resultSet != null) {
            resultSet.close();
        }
    }
}
