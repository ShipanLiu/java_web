package com.atguigu.baseDao;



/*
* 通用的  Data Base Access
*
* 就是 common 增删改。
*
* */

import com.atguigu.utils.JDBCUtils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseDao {


    public int update(String sql, Object...args) throws SQLException, IOException, ClassNotFoundException {

        // get connection
        Connection connection = JDBCUtils.sqlConnection();
        // get sql and  the insert value from the parameter
        // create preparedaStatement
        PreparedStatement pst = connection.prepareStatement(sql);
        if(args != null && args.length > 0 ) {
            for (int i = 0; i < args.length; i++) {
                pst.setObject(i+1, args[i]);
            }
        }
        // execute sql
         int i = pst.executeUpdate();
        // get the result
        return i;

        //we do not need to close the resource, because we are using the connection pool from Druid.
    }

    // at the end: after quering or cruding the database, we need to create a list to take the sata(for deliving to the frontend)


    /*
    * get the query data and encapsulate them into a list[]
    *
    * <T> : 就是泛型
    * clazz : is that a student or account.    different classes.
    * sql and args(for the ?? in the sql)
    *
    * */

    public <T>List<T> getAll(Class<T> clazz, String sql, Object ...args) throws Exception {
        // create an list
        List<T> list = new ArrayList<>();

        // get connewction
        Connection connection = JDBCUtils.sqlConnection();
        // get the preparedStatement
        PreparedStatement pst = connection.prepareStatement(sql);

        // get the count
        ResultSetMetaData metaData = pst.getMetaData();
        int columnCount = metaData.getColumnCount();


        // set up the value in sql
        if(args != null && args.length > 0) {
            for (int a = 0; a < args.length; a++) {
                pst.setObject(a+1, args[a]);
            }
        }
        // execute the sql and get the result
        ResultSet resultSet = pst.executeQuery();
        //traverse the result and set the result into the Object(Student or Account)
        while(resultSet.next()) {
            // We have to know the sql: how many column? what are the column names ? and What is the type
            // 要封装 不能new， 因为你不知道 要封装成 Student 还是 Account， 只能通过反射 clazz
            // 使用反射 创建 灵活的 对象， 至于如何确定对象的类型， 需要看你传的是啥
            T instance = clazz.newInstance();   //要封装封装成的对象就是 indtance
            // 问题： sql 里面的表头， 如何 和 对象中的属性 对应上 （id， sname, balance）
            // 获取 label（在sql 表里） 名字  + label对应的值。
            for(int i = 0; i< columnCount; i++) {
                // get label name
                String columnLabel = metaData.getColumnLabel(i+1);
                // get label value
                Object labelValue = resultSet.getObject(columnLabel);
                // reflect to the class
                Field field = clazz.getDeclaredField(columnLabel);
                // because the attribute is private in clazz
                field.setAccessible(true);
                // corresponding the label value in sqlTO the attribute(这个时候 field 已经知道要 target column， 只需要 目标对象 + 值)
                field.set(instance, labelValue);
            }

            // 到这一步， instance 已经被创建完成了， 装进list 里面。
            list.add(instance);
        }
        return list;
    }




    /*
    * 假如没有实体类的 情况下，如何存储？  就用 【{}】
    *
    *   [
            {id: 1, sname: "jiba"},
            {id: 2, sname: "xiaoming"}
        ]

        这是通用的 方法（就像API 返回的值一样）
     */


    public List<Map<String, Object>> MapWithList(String sql, Object...args) throws Exception {
        // create list
        List<Map<String, Object>> list = new ArrayList<>();
        // get connection
        Connection connection = JDBCUtils.sqlConnection();
        // get preparedStatement
        PreparedStatement pst= connection.prepareStatement(sql);
        // get metaData and columnCount
        ResultSetMetaData metaData = pst.getMetaData();
        int columnCount = metaData.getColumnCount();
        // execute the sql  correspond the  args to ? in sql
        if(args != null && args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                pst.setObject(i+1, args[i]);
            }
        }
        ResultSet resultSet = pst.executeQuery();
        // Add to Map
        while(resultSet.next()) {
            Map<String, Object> map = new HashMap<>();
            for (int i = 0; i < columnCount; i++) {
                // get label
                String label = metaData.getColumnLabel(i+1);
                // get label value
                Object value = resultSet.getObject(label);
                // add to map
                map.put(label, value);
            }
            // Add Map to list
            list.add(map);

        }


        return list;

    }

}
