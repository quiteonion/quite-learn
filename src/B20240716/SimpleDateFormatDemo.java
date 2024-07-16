package B20240716;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        /**
         * about SimpleFateFormat
         * 格式化：把时间模式改变为某种格式  format
         * 解析： 把字符转为某种格式的时间  parse
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 时：hh 分：mm 秒：ss  星期: EE");
        Date date = new Date(0L);
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }
}
