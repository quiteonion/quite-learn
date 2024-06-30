package B20240630;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateDemo {
    public static void main(String[] args) {
//        now();
        of();


    }
    public static void now(){
        LocalDate localDate =LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
    public static void of(){
        LocalDate localDate =LocalDate.of(1996,2,5);
        System.out.println(localDate);

        LocalTime localTime = LocalTime.of(17,47,26,46);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.of(1996,2,5,17,47,26,46);
        System.out.println(localDateTime);
    }
}
