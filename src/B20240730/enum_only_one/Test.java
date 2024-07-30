package B20240730.enum_only_one;

public class Test {
    public static void main(String[] args) {
        Student student = Student.STUDENT;
        Student student1 = Student.STUDENT;
        System.out.println(student1 == student);
    }
}
