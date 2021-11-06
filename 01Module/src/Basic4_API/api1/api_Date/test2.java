/*
* simpleDateFormat(已经不再使用)
*
* */

package Basic4_API.api1.api_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test2 {

    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String formatedDate = sdf.format(date);
        System.out.println(formatedDate);


        // 想要解析下面的东西。
        String str = "2021-11-5";
        // create new SimpleDateFormat with proper formai
        SimpleDateFormat parseSdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(parseSdf.parse(str));  // Fri Nov 05 00:00:00 CET 2021
    }
}
