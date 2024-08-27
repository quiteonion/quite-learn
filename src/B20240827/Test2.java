package B20240827;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        String[] users = {"zhangshan,23", "lisi,24", "wangwu,25"};
        Stream<String> stream = Arrays.stream(users);
        Stream<String> stringStream = stream.filter(s -> {
                    String[] split = s.split(",");
                    String s1 = split[1];
                    int age = Integer.valueOf(s1);
                    if (age > 23)
                        return true;
                    return false;
                }

        );

        Map<Object, Object> collect1 = stringStream.collect(Collectors.toMap(s -> {
            String[] split = s.split(",");
            return split[0];

        }, s -> {
            String[] split = s.split(",");
            return split[1];

        }));
        Set<Object> objects = collect1.keySet();
        for (Object object : objects) {
            System.out.println(collect1.get(object));
        }
    }
}
