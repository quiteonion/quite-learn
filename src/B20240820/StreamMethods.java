package B20240820;

import java.io.Serializable;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args) {
        String[] string = {"张吉惟","张吉惟","张吉惟","张吉惟","张吉惟","张吉惟", "林国瑞", "林玟书", "林雅南", "江奕云", "刘柏宏", "阮建安", "林子帆", "夏志豪", "吉茹定", "李中冰", "黄文隆"};
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

        System.out.println("==== === ====");

        /**
         * skip
         * 跳过前面几个元素
         */
        Stream<String> stream2 = Arrays.stream(string);
        Stream<String> skip = stream2.skip(3);
        skip.forEach(s -> System.out.println(s));

        System.out.println("==== === ====");

        /**
         * distinct
         * 元素去重
         */

        Stream<String> stream3 = Arrays.stream(string);
        Stream<String> distinct = stream3.distinct();
        distinct.forEach(s -> System.out.println(s));

        System.out.println("==== === ====");

        /**
         * concat
         * 合并两个流
         */

        Stream<String> concat = Stream.concat(Arrays.stream(string).limit(3), Arrays.stream(string).skip(3));
        concat.forEach(s -> System.out.println(s));

        System.out.println("---- --- ----");

        Integer[] integers = {1,2,3,4,5,6};
        String[] strings = {"q","w","e","r"};
        Stream<? extends Serializable> concat1 = Stream.concat(Arrays.stream(integers), Arrays.stream(strings));
        concat1.forEach(serializable -> System.out.println(serializable));

        System.out.println("==== === ====");

        /**
         * map
         * 将流中的类型进行转换
         */
        String[] user = {"张吉惟-45", "林国瑞-123", "林玟书-12", "林雅南-16", "江奕云-17", "刘柏宏-28", "阮建安-65", "林子帆-35"};
        Stream<String> stream4 = Arrays.stream(user);
        Stream<Integer> integerStream = stream4.map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] split = s.split("-");
                return Integer.valueOf(split[1]);
            }
        });
        integerStream.forEach(s-> System.out.println(s));

    }
}
