package com.atguigu.test01;

import com.atguigu.baseDao.BaseDao;
import com.atguigu.bean.Account;
import com.atguigu.bean.User;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class Test02_BaseDaoTest {

    BaseDao baseDao = new BaseDao();


    // 把数据库中 TABLE acount  来 封装成 一个一个的 Account 对象
    @Test
    public void test01() throws Exception {
        String sql = "select * from account where id < ?";
        Object[] o = {2};
        List<Account> all = baseDao.getAll(Account.class, sql, o);
        all.forEach(System.out::println);

    }

    // 把数据库中 TABLE users  来 封装成 一个一个的 User 对象
    @Test
    public void test02() throws Exception {
        String sql = "SELECT * FROM users";
        List<User> all = baseDao.getAll(User.class, sql, null);
        all.forEach(System.out::println);
    }

    /*
     * 问题：   select * from users   OR  select id, sname from users
     *
     *难道要针对每一个 查询（可能按照不同的分组）， 要创建 一个新的 实体类？？？？？？
     *
     *
     *
     * */

    @Test
    public void testMapWithList() throws Exception {
        String sql = "SELECT * FROM account WHERE id < ?";
        Object[] o = {3};
        List<Map<String, Object>> list = baseDao.MapWithList(sql, o);
        list.forEach(System.out::println);

        //  下面 漂亮输出：



        /*
        *
        *
        *   {balance=500, sname=jiba1, id=1}
            {balance=1500, sname=jiba2, id=2}
            {balance=0, sname=jiab, id=3}
            {balance=1, sname=蔡徐坤, id=4}
            {balance=1, sname=蔡徐坤, id=5}
        *
        *
        *
        * */
    }
}

