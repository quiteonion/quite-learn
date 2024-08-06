package A20240308;
public class StudentText {
    public static void main(String[] args) {
        Student s1 = Student.instanceAA();
        System.out.println(s1);

        Student s2 = Student.instanceAA();
        System.out.println(s2);
        /**
         * 以下是错误的代码展示
         */
       /* student s = student.getS();
        System.out.println("s  "   + s);
        student s1 =student.getS();
        System.out.println("s1  "   + s1);*/

    }
}
