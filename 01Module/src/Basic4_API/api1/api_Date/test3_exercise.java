/*
* 秒杀抢购
*
* 开始时间： 2020-11-11 0:0:0
* 结束时间： 2022-11-11 0:10:0
*
* jiba：  0:03:47
* dan： 0:10:11
*
* question: if both are success
*
* */

package Basic4_API.api1.api_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class test3_exercise {
    // throws 告诉程序， 这里有可能出现异常。
    public static void main(String[] args) throws ParseException {
        // 定义时间 + pare + 比较
        String start = "2021-11-11 00:00:00";
        String end = "2021-11-11 00:10:00";

        String jiba = "2021-11-11 00:03:00";
        String dan = "2021-11-11 00:11:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // sdf.parse(start) 是 Date， Date 有 getTime选项
        long startTime = sdf.parse(start).getTime();
        long endTime = sdf.parse(end).getTime();
        System.out.println(startTime);
        System.out.println(endTime);

        long jibaTime = sdf.parse(jiba).getTime();
        long danTime = sdf.parse(dan).getTime();

        if(jibaTime >= startTime && danTime <= danTime) {
            System.out.println("success");
        }
    }
}
