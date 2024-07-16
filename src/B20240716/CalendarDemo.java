package B20240716;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        Date d = new Date(0L);
        c.setTime(d);

        int year = c.get(1);
        int month = c.get(2)+1;
        int day = c.get(5);
        System.out.println(year + ", " + month + ", " + day);
        System.out.println(c);
    }
}
