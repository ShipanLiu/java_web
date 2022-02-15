


package com.atguigu.jdbctest02;

import com.atguigu.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test03_Events {


    // 事务， jiba1 给 jiba2  进行转账
    @Test
    public void testEvent() {

        Connection connection = null;
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;

        try{
            // register the driver
            Class.forName("com.mysql.jdbc.Driver");

            // create connection
            String url = "jdbc:mysql://192.168.233.132:3306/atguigu_test01";
            String user = "root";
            String pwd = "19980223";
            connection = DriverManager.getConnection(url, user, pwd);

            // connection 开启 事务, 不自动提交
            connection.setAutoCommit(false);
//

            // create sql
            String sql1 = "UPDATE account SET balance = balance - 500 where sname = 'jiba1'";
            String sql2 = "UPDATE account SET balance = balance + 500 where sname = 'jiba2'";

            // we have to create 2 ps(preparedaStatement), because we have 2 sqls
            ps1 = connection.prepareStatement(sql1);
            ps2 = connection.prepareStatement(sql2);


            ps1.executeUpdate();
            ps2.executeUpdate();

            connection.commit();

            System.out.println("转账成功");

        } catch (ClassNotFoundException | SQLException e ) {
            System.out.println(e.getMessage());
            e.printStackTrace();

            // 一旦发生异常，jiba1 转的钱， 就不能转出去。 数据还原。
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        } finally {
            try {
                JDBCUtils.closeResources(connection, ps1, null);
                JDBCUtils.closeResources(null, ps2, null);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
