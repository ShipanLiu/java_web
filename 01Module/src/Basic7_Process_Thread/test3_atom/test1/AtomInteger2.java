/*
* 成员方法
*
* */

package Basic7_Process_Thread.test3_atom.test1;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomInteger2 {
    public static void main(String[] args) {
        // default value is 0
        AtomicInteger ac = new AtomicInteger();

        System.out.println(ac.get());

        System.out.println(ac.getAndIncrement());
        System.out.println(ac.get());

        // 先 增 后加
        System.out.println(ac.incrementAndGet()); //2


        //
        System.out.println(ac.addAndGet(20)); //22


        System.out.println(ac.getAndSet(100)); // 100
        System.out.println(ac.get());
    }
}
