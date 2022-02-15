package com.atguigu.jdbctest01;

import com.mysql.jdbc.Driver;  // 对应下面的 new Driver
import jdk.jfr.StackTrace;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test01_crud {


    /*add one to the table*/
    @Test
    public void test01() throws SQLException {
        //00 add the driver
        //01 register the driver
        DriverManager.registerDriver(new Driver());
        //02 crate the connection
        String url = "jdbc:mysql://192.168.233.132:3306/atguigu_test01";
        String user = "root";
        String password = "19980223";

        Connection connection = DriverManager.getConnection(url, user, password);
        //03 create the execute statement
        Statement statement = connection.createStatement();

        //04 parpare teh sql
        String sql = "INSERT INTO users VALUES(NULL, 'jiba2', '12345678')";
        //05 execute the sql  增删改 都是用 update
        int i = statement.executeUpdate(sql);

        //06 get the execute result
        if(i > 0) {
            System.out.println("with success");
        } else {
            System.out.println("something wrong");
        }

        // 07 close the resource
        statement.close();
        connection.close();
    }

    /*change one from the table*/

    @Test
    public void change() throws SQLException, ClassNotFoundException {
        // 01 register the driver(用另一种方法)
        // Class.formame() 使用反射 会让JVM 来触发 类， 从而 来触发类里面的静态代码块。
        Class.forName("com.mysql.jdbc.Driver");
        // 02 create the connection
        String url = "jdbc:mysql://192.168.233.132:3306/atguigu_test01";
        String user = "root";
        String pwd = "19980223";
        Connection connection = DriverManager.getConnection(url, user, pwd);
        // create the sql
        String sql = "UPDATE users set sname='jiba' where id = 1";
        // create teh statement and execute the sql
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        // get teh result
        if(i > 0) {
            System.out.println("with success");
        } else {
            System.out.println("error");
        }
        // close the resource
        connection.close();
        statement.close();
    }

    /*删除一条记录*/
    @Test
    public void delete() throws SQLException {
        //01 驱动不用注册
        // reasons:  SPI  service provider interface  在加载jar包的时候， 就会自动加载 这个类。

        // 02 create connection
        String url = "jdbc:mysql://192.168.233.132:3306/atguigu_test01";
        String user = "root";
        String pwd = "19980223";
        Connection connection = DriverManager.getConnection(url, user, pwd);
        // 03 crate sql
        String sql = "delete from users where id = 1";

        // 04 create statement and execute
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);

        // 05 get result
        System.out.println(i);

        // clsoe resource
        statement.close();
        connection.close();
    }

}
