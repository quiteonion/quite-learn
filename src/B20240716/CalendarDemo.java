package B20240716;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        Date d = new Date(0L);
        c.setTime(d);
        System.out.println(c);
    }
}
