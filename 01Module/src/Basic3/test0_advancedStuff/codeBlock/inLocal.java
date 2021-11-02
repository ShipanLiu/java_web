/*
* 局部代码块
*
* 在方法中定义， 限定变量的生命周期， 及早释放， 提高内存的利用率。
*
*
* */


package Basic3.test0_advancedStuff.codeBlock;

public class inLocal {

    public static void main(String[] args) {
        {
            int a  = 10;
            System.out.println(a);
            // 到这一步， a已经被释放了。
        }
    }
}
