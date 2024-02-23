package A20240223;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student("黑娃子", 001,18);
        Student s1 = new Student("二愣子",002,16);
        System.out.println("学生"+s.getName()+"（"+s.getId()+"）的信息：学号为："+ s.getId()+"  名字为："+ s.getName()+"  年龄为："+ s.getAge());
        System.out.println("学生"+s1.getName()+"（"+s1.getId()+"）的信息：学号为："+ s1.getId()+"  名字为："+ s1.getName()+"  年龄为："+ s1.getAge());
    }
}
