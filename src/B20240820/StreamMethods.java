package B20240820;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args) {
        /**
         * filter
         * 过滤，相当于加入一个筛网，把自己不需要的过滤
         * 需要使用到其他的过滤方法
         */
        String[] s1 = {"张吉惟", "林国瑞", "林玟书", "林雅南", "江奕云", "刘柏宏", "阮建安", "林子帆", "夏志豪", "吉茹定", "李中冰", "黄文隆"};
        //数组要产生 Stream 流使用静态方法
        Stream<String> stream = Arrays.stream(s1);
        Stream<String> lin = stream.filter(s -> s.startsWith("林"));
        lin.forEach(s -> System.out.println(s));
    }
}
