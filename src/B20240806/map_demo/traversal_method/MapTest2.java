package B20240806.map_demo.traversal_method;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapTest2 {
    public static void main(String[] args) {
        /**
         * map 的遍历方式
         * 使用 forEach 重写 BiConsumer 进行遍历
         */
        Map<String, String> m = new HashMap<>();
        m.put("aaa","aaa");
        m.put("bbb","bbb");
        m.put("ccc","ccc");
        m.put("ddd","ddd");

        m.forEach(( s,  s2)-> {System.out.println(s);System.out.println(s2);}
        );
    }
}
