package B20240820;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args) {
        String[] string = {"张吉惟", "林国瑞", "林玟书", "林雅南", "江奕云", "刘柏宏", "阮建安", "林子帆", "夏志豪", "吉茹定", "李中冰", "黄文隆"};
        /**
         * filter
         * 过滤，相当于加入一个筛网，把自己不需要的过滤
         */

        //数组要产生 Stream 流使用静态方法
        Stream<String> stream = Arrays.stream(string);
        Stream<String> lin = stream.filter(s -> s.startsWith("林"));
        lin.forEach(s -> System.out.println(s));


        System.out.println("==== === ====");

        /**
         * limit
         * 选择并获取前面的几个元素
         */
        Stream<String> stream1 = Arrays.stream(string);
        Stream<String> limit = stream1.limit(2);
        limit.forEach(s -> System.out.println(s));


    }
}
