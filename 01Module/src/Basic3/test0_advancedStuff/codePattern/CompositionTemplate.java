/*
* 作文的模板
*
* */

package Basic3.test0_advancedStuff.codePattern;

public abstract class CompositionTemplate {

    // 这个 write 方法 是已经确定了的， 是骨架， 是不能被子类重写的。  final 关键字
    public final void write() {
        System.out.println("this is what I am going to say");
        body();
        System.out.println("oh? this is good");
    }

    public abstract void body();
}
