package com.atguigu.test01;

import com.atguigu.bean.Account;
import com.atguigu.utils.JDBCUtils;
import org.junit.Test;

import java.io.IOException;
import java.sql.*;

public class Test01 {



    /*
    * 尝试封装 sql 数据库里面每一条 记录， 为 Account 类型。
    *
    * query 操作
    * */
    @Test
    public void test01() throws SQLException, IOException, ClassNotFoundException {
        // get connection
        Connection connection  = JDBCUtils.sqlConnection();
        // create sql and the value array
        String sql = "SELECT * FROM account";
        // get preparedStatement
        PreparedStatement pst = connection.prepareStatement(sql);
        // get the matadata  , mata data is the  title from the sql disgram
        // for example : in account the metadata is "id", "sname", "balance"
        ResultSetMetaData metaData = pst.getMetaData();
        int metaDataCount = metaData.getColumnCount();
        System.out.println("the column count from metadata is: " + metaDataCount);
        for(int i = 0; i < metaDataCount; i ++) {
            System.out.println(metaData.getColumnName(i+1)); // id   sname  balance    sql表 初始定义的 名字
            System.out.println(metaData.getColumnLabel(i+1)); // id   sname  balance   sql 执行时候，换名， 或者自定义的名字、
                                                              // like: select id, sname name, balance from account   这时候 getColumnLabel 的鸡国就是 id name balance.
            System.out.println(metaData.getColumnClassName(i + 1));  // java.lang.Integer   java.lang.String  java.lang.Integer
        }

        // execute the sql
        ResultSet resultSet = pst.executeQuery();
        // get the result

        while(resultSet.next()) {
            int id = resultSet.getInt("id");
            String sname = resultSet.getString("sname");
            int balance = resultSet.getInt("balance");
            Account account = new Account(id, sname, balance);

//            System.out.println(account);

        }

        // close resource
        JDBCUtils.closeResources(connection, pst, resultSet);
    }
}
