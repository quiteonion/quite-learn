package B20240409.Student;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        Student s1 = new Student("1",2,"3");
        Student s2 = new Student("1",5,"3");
        Student s3 = new Student("1",78,"3");
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        System.out.println(StudentUtil.getAgeBig(arr));
    }
}
