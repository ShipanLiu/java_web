package Basic4_API.api1.api_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class test4_jdk8 {
    public static void main(String[] args) {
        // the current time
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);  // 2021-11-05T13:59:22.424065100

        // 创建 指定时间：
        LocalDateTime locatDateTime = LocalDateTime.of(2021, 11, 05, 14, 00, 00);
        System.out.println(locatDateTime); // 2021-11-05T14:00



        // methods
        LocalDateTime time = LocalDateTime.of(2020, 11, 11, 11,11, 11);
        System.out.println(time.getYear()); // 2020
        System.out.println(time.getMonthValue()); // 11
        System.out.println(time.getDayOfMonth()); // 11
        System.out.println(time.getDayOfYear()); // 这一天 是一年中的第几天。 316

        System.out.println(time.getDayOfWeek()); // WEDNESDAY
        System.out.println(time.getMinute()); // 11
        System.out.println(time.getHour()); // 11



        /*
        * 因为localDateTime 里面有 date 和 time
        * 转换 成 只有 date 或者 只有 time
        * */

        System.out.println(time.toLocalDate()); // 2020-11-11
        System.out.println(time.toLocalTime()); // 11:11:11




        // 日期  格式化   问题
        LocalDateTime timeNow = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String timeResult = timeNow.format(formatter);
        System.out.println(timeResult);  // 2021-11-05 15:30:37


        // parse, 必须提前 给一个 string
        String str = "2021-11-05 15:30:37";
        LocalDateTime parsedStr = LocalDateTime.parse(str, formatter);
        System.out.println(parsedStr);  // 2021-11-05T15:30:37



        // 增加时间 和  减少时间
        LocalDateTime testTime = LocalDateTime.of(2021, 11, 05, 15, 35, 00);
        // 增加一年
        LocalDateTime newTime = testTime.plusYears(1);
        System.out.println(newTime.format(formatter)); // 2022-11-05 15:35:00

        LocalDateTime newTime1 = testTime.minusMonths(1);
        System.out.println(newTime1.format(formatter)); // 2021-10-05 15:35:00


        //  修改时间 with
        // 直接修改年
        LocalDateTime newTime2 = testTime.withYear(2030);
        System.out.println(newTime2); // 2030-11-05T15:35


        // period  ，计算间隔

        LocalDate date1 = LocalDate.of(2020, 12, 05);
        LocalDate date2 = LocalDate.of(2021, 11, 30);
        Period period = Period.between(date1, date2);
        System.out.println(period); // P25D
        System.out.println(period.getYears()); // 0
        System.out.println(period.getMonths()); // 11
        System.out.println(period.getDays()); // 25
    }
}
