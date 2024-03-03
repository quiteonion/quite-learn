package A20240303;

import A20240303.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "小黑";
        student.age = 18;
        student.gender = '男';
        student.id  = 01;
        System.out.println("学生姓名： "+student.name+"年龄： "+student.age+"id： "+student.id+"性别： "+student.gender);
    }
}
