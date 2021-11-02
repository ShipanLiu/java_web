/*
* responsible for logic affires
*
*
* */


package Basic3.test0_advancedStuff.manager.service;

import Basic3.test0_advancedStuff.manager.dao.BaseStudentDao;
import Basic3.test0_advancedStuff.manager.dao.StudentDao;
import Basic3.test0_advancedStuff.manager.domain.Student;
import Basic3.test0_advancedStuff.manager.factory.StudentDaoFactory;

public class StudentService {
    // 01 创建 StudentDao（库管）
//    private StudentDao studentDao = new StudentDao();
    // 获取 库管对象
    private BaseStudentDao studentDao = StudentDaoFactory.getStudentDao();
    public boolean addStudent(Student stu) {

        // 02 将学生对象传递过去。
        // 03 返回Boolean
        return studentDao.addStudent(stu);
    }

    public boolean isExist(String id) {
        Student[] allStudents = studentDao.findAllStudent();
        boolean exists = false;
        for (int i = 0; i < allStudents.length; i++) {
            if(allStudents[i] != null && allStudents[i].getId().equals(id)) {
                exists = true;
                // 没有必要往下走了。
                break;
            }
        }

        return exists;
    }

    public Student[] findAllStudent() {
        // 调用StudentDao 里面的findStudent方法
        Student[] allStudent = studentDao.findAllStudent();
        // 判断数组是否有学生信息。 ， 只要有一个存在， 就返回数组的地址, 空的话， 返回null。
        boolean flag = false;
        for (int i = 0; i < allStudent.length; i++) {
            if(allStudent[i] != null) {
                // 说明有学生
                flag = true;
                break;
            }
        }

        // flag == true 代表有学生
        if(flag == true) {
            return allStudent;
        } else {
            return null;
        }
    }


    public void deleteStudentById(String id) {
        studentDao.deleteStudentById(id);
    }

    public void updateStudent(String updateId, Student newStu) {
        studentDao.updateStudent(updateId, newStu);
    }
}
