package B20240720;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) throws ParseException {
        LocalDate ld = LocalDate.of(2000,3,1);
        LocalDate minus = ld.minusDays(1);
        if (minus.getDayOfMonth() == 29){
            System.out.println("闰年");
        }else {
            System.out.println("平年");
        }
    }
}
