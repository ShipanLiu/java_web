/*
 * 作为 两个Dao的父类
 *
 * 在父类中， 我们只保留 共性的内容。
 *
 *
 *
 * */


package Basic3.test0_advancedStuff.manager.dao;

import Basic3.test0_advancedStuff.manager.domain.Student;

public interface BaseStudentDao {
    public abstract Student[] findAllStudent();
    public abstract boolean addStudent(Student stu);
    public abstract void deleteStudentById(String delId);
    public abstract int getIndex(String id);
    public abstract void updateStudent(String updateId, Student newStu);
}
