package B20240719;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        String d = "2004-09-09";
        String now = "2024-07-19";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse(d);
        Date parse1 = simpleDateFormat.parse(now);
        long time = parse1.getTime();
        long time1 = parse.getTime();
        long l = time - time1;
        long l1 = l / 1000 / 60 / 60 / 24;
        System.out.println(l1);


    }
}
