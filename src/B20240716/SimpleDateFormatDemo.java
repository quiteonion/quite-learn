package B20240716;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        /**
         * about SimpleFateFormat
         * 格式化：把时间模式改变为某种格式  format
         * 解析： 把字符转为某种格式的时间  parse
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = new Date(0L);
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        String str = "2023-06-09 16:00:00";
        Date parse = simpleDateFormat.parse(str);
        System.out.println(parse);
        System.out.println(parse.getTime());
    }
}
