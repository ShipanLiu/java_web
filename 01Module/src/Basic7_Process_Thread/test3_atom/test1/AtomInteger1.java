package Basic7_Process_Thread.test3_atom.test1;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomInteger1  {
    public static void main(String[] args) {
        // default value is 0
        AtomicInteger ac = new AtomicInteger();
        System.out.println(ac);
        // create a value of 10
        AtomicInteger ac2 = new AtomicInteger(10);
        System.out.println(ac2);
    }
}
