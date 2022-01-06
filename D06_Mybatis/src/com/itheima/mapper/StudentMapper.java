/*
*
* 这个 mappper 相当于   dao 层
* */

package com.itheima.mapper;

import com.itheima.bean.Student;

import java.util.List;

public interface StudentMapper {
    public abstract List<Student> selectAll();

    public abstract Student selectById(Integer id);

    public abstract Integer insert(Student stu);

    //修改数据
    public abstract Integer update(Student stu);

    //删除数据
    public abstract Integer delete(Integer id);

}
