package A20240308;
public class StudentText {
    public static void main(String[] args) {
        Student s1 = Student.s;
        System.out.println(s1);

        Student s2 = Student.s;
        System.out.println(s2);
        /**
         * 以下是错误的代码展示
         */
       /* Student s = Student.getS();
        System.out.println("s  "   + s);
        Student s1 =Student.getS();
        System.out.println("s1  "   + s1);*/

    }
}
