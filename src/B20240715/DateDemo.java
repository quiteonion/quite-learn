package B20240715;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //关于时间
        Date date = new Date();
        System.out.println(date);
        Date date1 = new Date(0L);
        System.out.println(date1);

        date1.setTime(1000);
        System.out.println(date1);
    }
}
