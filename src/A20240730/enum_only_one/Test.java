package A20240730.enum_only_one;

public class Test {
    public static void main(String[] args) {
        Student student = Student.STUDENT;
        Student student1 = Student.STUDENT;
        System.out.println(student1 == student);
        Student boy = Student.BOY;
        student.name = "123";
        System.out.println(boy.name);
        System.out.println(student.name);
        System.out.println(student);
        System.out.println(boy);
    }
}
