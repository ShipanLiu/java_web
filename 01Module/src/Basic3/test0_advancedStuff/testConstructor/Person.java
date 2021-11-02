package Basic3.test0_advancedStuff.testConstructor;

public class Person {
    // Person 自己私有的成员属性
    private String name;
    private int age;

    //创建无参 构造方法
    public Person() {
        System.out.println("我是 父类 无参 构造方法");
    }

    //创建有参 构造方法

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
        System.out.println("我是父类有参 构造方法");
    }


    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
}
