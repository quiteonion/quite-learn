package B20240716;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        Date d = new Date(0L);
        c.setTime(d);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);

        c.set(Calendar.YEAR, 2000);

        System.out.println(year + ", " + month + ", " + day);
        System.out.println(c);
        System.out.println("=== === ===");
        int year1 = c.get(Calendar.YEAR);
        System.out.println(year1);
        System.out.println("=== === ===");
        c.add(Calendar.YEAR, 1);
        int year2 = c.get(Calendar.YEAR);
        System.out.println(year2);
    }
}
