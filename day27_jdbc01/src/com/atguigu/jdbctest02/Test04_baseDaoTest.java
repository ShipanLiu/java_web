package com.atguigu.jdbctest02;

import com.atguigu.baseDao.BaseDao;
import org.junit.Test;

import java.io.IOException;
import java.sql.SQLException;

public class Test04_baseDaoTest {


    BaseDao baseDao = new BaseDao();
    @Test
    public void testBaseDao() throws SQLException, IOException, ClassNotFoundException {
        String sql = "insert into account values(null,?,?)";

        // deliver the data
        Object[] o = {"蔡徐坤", 001};
        int i = baseDao.commomAdd(sql, o);
        System.out.println(i > 0 ? "success" : "fail");
    }
}
