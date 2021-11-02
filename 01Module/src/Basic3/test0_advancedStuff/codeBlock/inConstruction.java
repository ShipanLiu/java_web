/*
* 类中， 方法外定义
* 代码块 优先于 构造方法执行。
*
* 作用： 及那个多个构造方法中相同的代码， 抽取到构造代码块中。 把重复的代码放进去
*
*
* usage: 不管在 调用空参构造， 还是有参构造的时候 ， 都打印好好学习：
*
*
*
* */


package Basic3.test0_advancedStuff.codeBlock;

public class inConstruction {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student(10);
    }

}

class Student {
    {
        System.out.println("请好好学习");
    }

    public Student() {
        System.out.println("不带 参数的方法");
    }

    public Student(int a) {
        System.out.println("带参数方法 》》》》》");
    }
}
