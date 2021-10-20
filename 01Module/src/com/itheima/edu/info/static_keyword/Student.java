package com.itheima.edu.info.static_keyword;

public class Student {
    String name;
    int age;
    // 被关键字 static 所修饰。
    static String school;

    public void show() {
        System.out.println(name + "...." + age + "...." + school);
    }

    /*
    *下面代码出错。 因为
    * 静态方法 只能 访问 静态变量（静态成员方法， 成员变量）
    * 非静态方法中， 可以使用静态成员（因为创建的早）
    * 静态方法中， 没有this关键字。
    *
    * name, age 不是静态的， 还没来得及产生呢， 自然不允许被调用。
    *
    * */
    public static void show2() {
//        System.out.println(name, age, school);
        // 错误， this 指的是这个对象， 而static 没有对象。
//        this.age;
    }
}
