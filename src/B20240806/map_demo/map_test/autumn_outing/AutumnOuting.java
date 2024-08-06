package B20240806.map_demo.map_test.autumn_outing;

import java.util.HashMap;
import java.util.Random;

public class AutumnOuting {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] abcd = {"A", "B", "C", "D"};
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int j = r.nextInt(4);
            String s = abcd[j];
            if (map.containsKey(s)) {
                Integer l = map.get(s);
                map.put(s, l + 1);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(map);
    }
}
