/*
 * crud of the database
 *
 *
 * */


package Basic3.test0_advancedStuff.manager.dao;

import Basic3.test0_advancedStuff.manager.domain.Student;

public class StudentDao implements BaseStudentDao {

    // 创建学生数组对象
    private static Student[] stus = new Student[5];

    // 利用静态代码块， 提前存储两个 学生。
    static {
        Student stu1 = new Student("jiba1", "jiba", "23", "1999");
        Student stu2 = new Student("jiba2", "jiba", "23", "1999");
        stus[0] = stu1;
        stus[1] = stu2;
    }

    @Override
    public Student[] findAllStudent() {
        return stus;
    }
    @Override
    public boolean addStudent(Student stu) {
        // 添加学生到数组中null的位置。
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            if (stus[i] == null) {
                // 记录第一个null 的位置， 以便存进去。
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("the array is full");
            return false;
        } else {
            stus[index] = stu;
            return true;
        }

    }
    @Override
    public void deleteStudentById(String delId) {
        // 查找id所在索引的位置， 将该位置 重新设置成null（相当于删除）
        int index = getIndex(delId);
        // 既然你代码能够走到这一步，说明 逻辑其实是正确的。
        stus[index] = null;

    }
    @Override
    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            if (stus[i] != null && stus[i].getId().equals(id)) {
                index = i;
                //找到就break；
                break;
            }
        }
        return index;
    }
    @Override
    public void updateStudent(String updateId, Student newStu) {
        // 找到id
        int index = getIndex(updateId);
        // 替换
        stus[index] = newStu;
    }
}
