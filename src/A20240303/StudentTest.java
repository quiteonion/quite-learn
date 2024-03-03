package A20240303;

import A20240303.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("小黑",18,'男',01);
        System.out.println("学生姓名： "+student.getName()+"年龄： "+student.getAge()+"id： "+student.getId()+"性别： "+student.getGender());
    }
}
