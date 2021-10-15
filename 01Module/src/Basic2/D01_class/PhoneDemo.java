/*
* create the Object of class
*
* */

package Basic2.D01_class;

public class PhoneDemo {

    public static void main(String[] args) {
        Phone p = new Phone();

        //use the member variable
        System.out.println(p.price);

        p.price = 2000;
        p.brand = "Nokia";
        System.out.println(p.brand);

        // use the member methods

        p.call();  // call

    }

}
