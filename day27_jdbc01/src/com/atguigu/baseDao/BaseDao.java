package com.atguigu.baseDao;

/*
* base : 基础
* dao :  data access Object
*
* 这个类就是用于数据基础访问的。
*
*
* 通用的 删增改  ：   需要 知道 sql 语句是什么，   需要知道 有几个 问号？
*
* insert into account values(null, ?, ?)
* update account set sname=? where id=?
* delete from account where id =?
*
* 如何知道？ 的个数 和 类型？     用 可变变量 ：  ...objs，  类型设置成  Object
*
* */


import com.atguigu.utils.JDBCUtils_Upgrated;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BaseDao {

    /*
        新增
     * */
    public int commomAdd(String sql, Object...objs) throws SQLException, IOException, ClassNotFoundException {
        // 1. 获取连接
        Connection connection = JDBCUtils_Upgrated.sqlConnection();
        // 2. 准备sql, 用形参传入
        // 3. 准备命令发送器。
        PreparedStatement ps = connection.prepareStatement(sql);

        if(objs != null && objs.length > 0) {
            for(int i = 0; i <objs.length; i++) {  // 每一个 问号 对应一个 值。l
                //进行设置值。一一对应。
                ps.setObject(i+1, objs[i]);
            }
        }

        //4. execute and get the result
        int i = ps.executeUpdate();

        return i;
    }

    // delete


    // update
}
