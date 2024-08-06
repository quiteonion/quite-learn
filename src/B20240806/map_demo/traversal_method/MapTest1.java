package B20240806.map_demo.traversal_method;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {
    public static void main(String[] args) {
        /**
         * map 的遍历方式
         * 2、 通过键值对的方式直接获取遍历
         * 使用 entrySet 后在再调用对应的 getKey 和 getValue
         */
        Map<String, String> m = new HashMap<>();
        m.put("aaa","aaa");
        m.put("bbb","bbb");
        m.put("ccc","ccc");
        m.put("ddd","ddd");

        Set<Map.Entry<String, String>> entries = m.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
