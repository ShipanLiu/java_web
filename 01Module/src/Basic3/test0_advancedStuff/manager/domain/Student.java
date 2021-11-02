package Basic3.test0_advancedStuff.manager.domain;


// 尽管继承了 Person 类， 但是 构造函数不要忘记。
public class Student extends Person {
    public Student() {
    }

    public Student(String id, String name, String age, String birthday) {
        super(id, name, age, birthday);
    }
}
