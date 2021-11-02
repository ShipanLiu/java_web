package Basic3.test0_advancedStuff.testConstructor;

public class Student extends Person {

    // 区别于 Person 父类， 子类自己特有的方法
    private int score;

    // 每一次创建 子类的时候， 都会创建父类的空参构造方法。
    // bacause 子类在初始化之前， 一定要先访问到父类的构造方法。 完成父类数据的初始化。
    // 系统在 每一个 构造方法中， 默认隐藏一句代码 ： super()
    public Student() {
        super();
        System.out.println("我是 子类 的空参构造方法。");
    }

    // 完整的 数据，   父类的成员变量 + 子类的成员变量。
    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
