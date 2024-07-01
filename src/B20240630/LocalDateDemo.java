package B20240630;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class LocalDateDemo {
    public static void main(String[] args) {
//        now();
//        of();
//        getXxx();
//        with();
//        plus();
//        minus();
        format();

    }

    private static void format() {
        //如果你在网页进行爬虫时，想要获取当前的时间，你会发现，某些网页的时间并不符合 Java 所提供的 yyyy-MM-ddTHH:mm 时间排列方式，这个时候我们就可以自己设置他的时间格式，使得爬虫可以顺利的进行
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    }

    private static void minus() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("增加前的时间 "+localDateTime);
        LocalDateTime localDateTime1 = localDateTime.minusDays(5);
        System.out.println("增加后的时间 "+localDateTime1);
    }

    private static void plus() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("增加前的时间 "+localDateTime);
        LocalDateTime localDateTime1 = localDateTime.plusDays(5);
        System.out.println("增加后的时间 "+localDateTime1);
    }

    private static void with() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("修改前的时间 "+localDateTime.getHour());
        LocalDateTime localDateTime1 = localDateTime.withHour(5);
        System.out.println("修改后的时间 "+localDateTime1.getHour());
    }

    public static void getXxx() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("今天是今年的第几 天   " + localDateTime.getDayOfYear());
        System.out.println("今天是今年的第几 月   " + localDateTime.getDayOfMonth());
        System.out.println("今天是今年的第几 周   " + localDateTime.getDayOfWeek());
        System.out.println("今年是 " + localDateTime.getYear());
        System.out.println("获取今天的月数 " + localDateTime.getMonthValue());
        System.out.println("这个月是 " + localDateTime.getMonth());
        System.out.println("现在是几点 " + localDateTime.getHour());
    }

    public static void now() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }

    public static void of() {
        LocalDate localDate = LocalDate.of(1996, 2, 5);
        System.out.println(localDate);

        LocalTime localTime = LocalTime.of(17, 47, 26, 46);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.of(1996, 2, 5, 17, 47, 26, 46);
        System.out.println(localDateTime);
    }
}
