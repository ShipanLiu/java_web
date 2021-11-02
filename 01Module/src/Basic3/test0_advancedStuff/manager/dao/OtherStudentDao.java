/*
 * crud of the database
 *
 * 不再使用 array， 而是用ArrayList
 *
 *
 * */


package Basic3.test0_advancedStuff.manager.dao;

import Basic3.test0_advancedStuff.manager.domain.Student;

import java.util.ArrayList;

public class OtherStudentDao implements BaseStudentDao{
    // 创建学生ArrayList
    private static ArrayList<Student> stus = new ArrayList<>();

    // 利用静态代码块， 提前存储两个 学生。
    static {
        Student stu1 = new Student("jiba1", "jiba", "23", "1999");
        Student stu2 = new Student("jiba2", "jiba", "23", "1999");
        stus.add(stu1);
        stus.add(stu2);
    }
    @Override
    public Student[] findAllStudent() {
        // 创建一个新的数组， 然后返回。
        Student[] newStudentArray = new Student[stus.size()];
        for (int i = 0; i < newStudentArray.length; i++) {
            newStudentArray[i]  = stus.get(i);
        }
        return newStudentArray;
    }
    @Override
    public boolean addStudent(Student stu) {
       stus.add(stu);
       // 因为一直是 无法装满的情况。
        return true;
    }
    @Override
    public void deleteStudentById(String delId) {
        // 查找id所在索引的位置， 将该位置 重新设置成null（相当于删除）
        int index = getIndex(delId);
        // 既然你代码能够走到这一步，说明 逻辑其实是正确的。
        stus.remove(index);

    }
    @Override
    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < stus.size(); i++) {
            if (stus.get(i) != null && stus.get(i).getId().equals(id)) {
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
        stus.set(index, newStu);
    }
}
