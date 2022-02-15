package com.atguigu.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;



/*
* 数据库 连接 和报错  大量代码重复， 因此抽到 一个方法 里面。
*
*
* */


public class JDBCUtils_Upgrated {

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        sqlConnection();
    }

    static DataSource dataSource = null;

    static {
        Properties properties = new Properties();
        try {
            properties.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));

            // 根据拿到的properties 创建 连接池。
            dataSource = DruidDataSourceFactory.createDataSource(properties);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static Connection sqlConnection() throws ClassNotFoundException, SQLException, IOException {

        Connection connection = dataSource.getConnection();
        System.out.println("create connection  with success");
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
