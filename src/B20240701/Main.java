package B20240701;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2023,6,9,17,0);
        int time = localDateTime.getDayOfYear();
        System.out.println(time);
    }
}
