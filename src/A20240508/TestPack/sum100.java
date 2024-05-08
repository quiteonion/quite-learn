package A20240508.TestPack;

import java.sql.Time;

public class sum100 {

    public static void main(String[] args) {
        //如何知道运行了多少时间
        long begin = System.currentTimeMillis();
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum +=i;
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        long time = end - begin;
        System.out.println(time);
    }
}
