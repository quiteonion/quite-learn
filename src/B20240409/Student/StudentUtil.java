package B20240409.Student;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {
    }
    public static String getAgeBig(ArrayList<Student> arr) {
        int j = 0;
        int number = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (number < arr.get(i).getAge()){
                number = arr.get(i).getAge();
                j = i;
            }
        }
        return String.valueOf(arr.get(j).getAge());
    }
}
