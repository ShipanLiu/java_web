/*
* 匿名内部类的 实际应用
*
*
* */

package Basic3.test2_innerClass.test5_innerClass_anonymous.test2;

public class TestSwimming {
    public static void main(String[] args) {

        // 这个方法 需要 一个 Swimming 接口的匿名对象
        goSwimming( new Swimming() {
            @Override
            public void swim() {
                System.out.println("let us go to swimm");
            }
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
