package B20240827;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        String[] man = {"张三，23", "李四，24", "王五五，25", "赵其六，26", "孟七，27", "柳芭芘，28"};
        String[] woman = {"杨三，23", "李四，24", "杨五五，25", "赵其六，26", "杨七，27", "柳芭芘，28"};
        Stream<String> stream1 = Arrays.stream(man);
        Stream<String> stream2 = Arrays.stream(woman);

        Stream<String> s1 = stream1.filter(s -> {
            String[] split = s.split("，");
            if (split[0].length() == 3)
                return true;
            return false;
        }).limit(2);
        Stream<String> s2 = stream2.skip(1).filter(s -> s.startsWith("杨"));

        Stream<String> stream = Stream.concat(s1, s2);
        List<Actor> arr = new ArrayList<>();
        stream.forEach(s->{
            String[] split = s.split("，");
            System.out.println(split[0]);
            arr.add(new Actor(split[0],Integer.valueOf(split[1])));
        });
        System.out.println(arr);
    }
}

class Actor {
    String name;
    int age;

    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}