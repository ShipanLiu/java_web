package Basic3.test3_lambda.test2_lambdaExercise;

public class Test1 {
    public static void main(String[] args) {

        // 正常方法 调用
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("我是 匿名内部类的 show method");
            }
        });

        // lambda 方式
        useShowHandler(() -> {
            System.out.println("lambda show method");
        });

        usePrint(new Print() {
            @Override
            public void printMessage(String msg) {
                System.out.println("i am anonymous class" + msg);
            }
        });

        // lambda 实现
        usePrint((String msg) -> {
            System.out.println("this is from lambda" + msg);
        });




        usePrint2(new Print2() {
            @Override
            public int getNumber() {
                return 20;
            }
        });



        usePrint3(new Print3() {
            @Override
            public String getStr(String str) {
                return str;
            }
        });



    }







    // create a useShowHandler method
    public static void useShowHandler(ShowHandler showHandler) {
        // 调用show method
        showHandler.show();
    }


    public static void usePrint(Print pr) {
        pr.printMessage("new message");
    }

    public static void usePrint2(Print2 pr2) {
        int number = pr2.getNumber();
        System.out.println(number);
    }

    public static void usePrint3(Print3 pr3) {
        String str = pr3.getStr("jiba");
        System.out.println(str);
    }
}

// 创建一个interface， 只能式interface ， 不能是类

//  无参数， 无返回值。
interface ShowHandler {
    // same as public abstract void show() {}
    void show();
}

// 带参数 无返回值
interface Print{
    void printMessage(String msg);
}

// 无参数， 有返回值。
interface Print2 {
    int getNumber();
}


interface Print3 {
    String getStr(String str);
}


