/*
* 不定义构造方法的时候， 系统会自动定义一个无参的构造方法。
*
* 构造方法可以写多个（区别就是参数的种类 和 个数 不一样）
*
*
* */


package Basic2.D03_constructionMethod;

import java.sql.SQLOutput;

public class Student {
    //01
    private String name;
    private int age;

    public Student() {}

    // 构造方法还可以利用时机，惊醒初始化
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("构造方法立刻被调用");
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void show() {
        System.out.println(name + "," + age);
    }
}
