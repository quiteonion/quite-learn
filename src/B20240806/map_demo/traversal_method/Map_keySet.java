package B20240806.map_demo.traversal_method;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_keySet {
    public static void main(String[] args) {
        /**
         * map 的遍历方式
         * 1、使用 keySet 获取 key 数组后进行遍历
         */
        Map<String, String> m = new HashMap<>();
        m.put("aaa","aaa");
        m.put("bbb","bbb");
        m.put("ccc","ccc");
        m.put("ddd","ddd");

        Set<String> set = m.keySet();
        for (String s : set) {
            System.out.println(s);
            System.out.println(m.get(s));
        }
    }
}
