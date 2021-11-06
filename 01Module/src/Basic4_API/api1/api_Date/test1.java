package Basic4_API.api1.api_Date;

import java.util.Date;

public class test1 {
    public static void main(String[] args) {
        // the current time
        Date date1 = new Date();
        System.out.println(date1);
        System.out.println(date1.getTime());
        System.out.println(System.currentTimeMillis());
    }
}
