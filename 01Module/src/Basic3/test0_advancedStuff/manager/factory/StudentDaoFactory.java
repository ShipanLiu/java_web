/*
* 主要利用多态的  思想
*
* 把 BaseStudentDao and OtherStudentDao 处理一下。
*
* */

package Basic3.test0_advancedStuff.manager.factory;

import Basic3.test0_advancedStuff.manager.dao.BaseStudentDao;
import Basic3.test0_advancedStuff.manager.dao.OtherStudentDao;

public class StudentDaoFactory {

    // 之所以 static， 是因为可以 类 直接调用
    public static BaseStudentDao getStudentDao() {
        return new OtherStudentDao();
    }
}
