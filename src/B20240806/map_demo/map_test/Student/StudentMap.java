package B20240806.map_demo.map_test.Student;

import java.util.HashMap;

public class StudentMap {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
        map.put(new Student("小明", 18, "山东"), "山东");
        map.put(new Student("小红", 28, "福建"), "福建");
        map.put(new Student("小刚", 18, "辽宁"), "辽宁");
        map.put(new Student("小红", 28, "福建"), "福建");

    }
}
