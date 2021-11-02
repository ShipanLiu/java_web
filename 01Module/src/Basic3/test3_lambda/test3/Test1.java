/*
 * 自己写一个 Lambda 表达式
 *
 * */

package Basic3.test3_lambda.test3;

public class Test1 {
    public static void main(String[] args) {

        //  匿名内部类的形式

        useInter(new Inter() {
            @Override
            public double method(double a, double b) {
                return a + b;
            }
        });

        // lambda 形式
        // 参数类型double 可以省
        useInter((a, b) -> {
            return a + b;
        });
    }

    public static void useInter(Inter i) {
        double sum = i.method(2, 3);
        System.out.println(sum);  // 5.0
    }
}


interface Inter {
    double method(double a, double b);
}
