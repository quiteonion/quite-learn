package A20240303;

import A20240303.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("小黑",18,'男',01);
        Student s = new Student();
        s.setName("hhh");
        s.setId(02);
        s.setAge(19);
        s.setGender('女');
        System.out.println("学生姓名： "+student.getName()+"年龄： "+student.getAge()+"id： "+student.getId()+"性别： "+student.getGender());
        System.out.println("学生姓名： "+s.getName()+"年龄： "+s.getAge()+"id： "+s.getId()+"性别： "+s.getGender());
    }
}
