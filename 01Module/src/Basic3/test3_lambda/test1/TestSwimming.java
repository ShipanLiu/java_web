/*
* Lambda   函数式 编程思想
*
* */

package Basic3.test3_lambda.test1;

public class TestSwimming {
    public static void main(String[] args) {

        // 这个方法 需要 一个 Swimming 接口的匿名对象
        goSwimming( new Swimming() {
            @Override
            public void swim() {
                System.out.println("let us go to swimm");
            }
        });

        /*
        * Lambda 表达式 就是 对 匿名内部类的 优化
        *
        * */

        goSwimming(() -> {
            System.out.println("Lambda 优化");
        });
    }

    public static void goSwimming(Swimming swimming) {
        swimming.swim();
    }

}


/*
 * 游泳接口
 * */

interface Swimming {
    void swim();
}
