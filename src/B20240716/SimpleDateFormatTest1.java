package B20240716;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest1 {
    public static void main(String[] args) throws ParseException {
        String begin = "2023-11-11 0:0:0";
        String end = "2023-11-11 0:10:0";

        String xiaoji = "2023-11-11 0:01:00";
        String xiaopi = "2023-11-11 0:11:0";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date parse = sdf.parse(begin);
        Date parse1 = sdf.parse(end);
        Date parse2 = sdf.parse(xiaoji);
        Date parse3 = sdf.parse(xiaopi);

        long time = parse.getTime();
        long time1 = parse1.getTime();
        long time2 = parse2.getTime();
        long time3 = parse3.getTime();

        if (time2>time&&time2<time1)
            System.out.println("小鸡成功");

        if (time3>time&&time3<time1)
            System.out.println("小皮成功");
    }
}
