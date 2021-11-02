package Basic3.test0_advancedStuff.testInterface;

public interface Inter2 {
    public abstract void print1();
    public abstract void print2();


    public default void defaultMethod1() {
        log();
    }

    public default void defaultMethod2() {
        log();
    }

    // 这个方法 我不希望外界的人使用， 所以就 定义成private
    private void log() {
        System.out.println("i am a default method");
    }
}
