package com.itheima.dao;

import com.itheima.bean.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.List;

public class StudentTest01 {

    @Test
    public void selectAll() throws Exception {
        //1.加载核心配置文件
        InputStream is = Resources.getResourceAsStream("MyBatisConfig.xml");
        // 另一种方法 ： 得到当前的 class 对象
//        InputStream is = StudentTest01.class.getClassLoader().getResourceAsStream("MyBatisConfig.xml");

        //2.获取SqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        //3.通过SqlSession工厂对象获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //4.执行映射配置文件中的sql语句，并接收结果
        List<Student> list = sqlSession.selectList("StudentMapper.selectAll");

        //5.处理结果
        for (Student stu : list) {
            System.out.println(stu);
        }

        //6.释放资源
        sqlSession.close();
        is.close();
    }


    /*
    根据id查询
 */
    @Test
    public void selectById() throws Exception{
        //1.加载核心配置文件
        InputStream is = Resources.getResourceAsStream("MyBatisConfig.xml");

        //2.获取SqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂对象获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //4.执行映射配置文件中的sql语句，并接收结果, 把想要查询的 id 传进去。
        Student stu = sqlSession.selectOne("StudentMapper.selectById", 3);

        //5.处理结果
        System.out.println(stu);

        //6.释放资源
        sqlSession.close();
        is.close();
    }

    /*
           新增功能
        */
    @Test
    public void insert() throws Exception{
        //1.加载核心配置文件
        InputStream is = Resources.getResourceAsStream("MyBatisConfig.xml");

        //2.获取SqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂对象获取SqlSession对象
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        // 注意 要加上 true， 表示 自动commit
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        //4.执行映射配置文件中的sql语句，并接收结果
        Student stu = new Student(5,"周七",27);
        int result = sqlSession.insert("StudentMapper.insert", stu);

        //5.提交事务， 第三步 机上参数 true 之后， 就不需要 改了，
        //sqlSession.commit();

        //6.处理结果
        System.out.println(result);

        //7.释放资源
        sqlSession.close();
        is.close();
    }


    /*
       修改功能
    */
    @Test
    public void update() throws Exception{
        //1.加载核心配置文件
        InputStream is = Resources.getResourceAsStream("MyBatisConfig.xml");

        //2.获取SqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂对象获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //SqlSession sqlSession = sqlSessionFactory.openSession(true);

        //4.执行映射配置文件中的sql语句，并接收结果
        Student stu = new Student(5,"周七",37);
        int result = sqlSession.update("StudentMapper.update",stu);

        //5.提交事务， 当第三步没有 true 参数的时候。
        sqlSession.commit();

        //6.处理结果
        System.out.println(result);

        //7.释放资源
        sqlSession.close();
        is.close();
    }

    /*
       删除功能
    */
    @Test
    public void delete() throws Exception{
        //1.加载核心配置文件
        InputStream is = Resources.getResourceAsStream("MyBatisConfig.xml");

        //2.获取SqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂对象获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //SqlSession sqlSession = sqlSessionFactory.openSession(true);

        //4.执行映射配置文件中的sql语句，并接收结果
        int result = sqlSession.delete("StudentMapper.delete",1);

        //5.提交事务
        sqlSession.commit();

        //6.处理结果
        System.out.println(result);

        //7.释放资源
        sqlSession.close();
        is.close();
    }




}
