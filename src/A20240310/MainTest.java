package A20240310;

import A20240104.Student;

public class MainTest {
    public static void main(String[] args) {
        Main m1= Main.getInstance();
        System.out.println(m1);
        Main m2= Main.getInstance();
        System.out.println(m2);
    }
}
