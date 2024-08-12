package B20240812;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] students = {"小明", "小红", "小刚", "小智", "小梦", "小如"};
        List<String> list = new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            list.add(students[i]);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int index = random.nextInt(list.size());
            String remove = list.remove(index);
            System.out.println(remove);
        }

    }
}
