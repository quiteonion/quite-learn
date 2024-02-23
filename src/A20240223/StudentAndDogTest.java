package A20240223;

import java.util.Scanner;

public class StudentAndDogTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentAndDog sd = new StudentAndDog();
        StudentAndDog sd1 = new StudentAndDog();
        System.out.println("输入第一个学生的名字");
        String name1 = sc.next();
        sd.student.setName(name1);
        System.out.println("请输入第一个学生的学号");
        int id1 = sc.nextInt();
        sd.student.setId(id1);
        System.out.println("请输入第一个学生的年龄");
        int age1 = sc.nextInt();
        sd.student.setAge(age1);
        System.out.println("请输入第一个学生的狗狗们");
        String dogs1 = sc.next();
        sd.setDogs(dogs1);

        System.out.println("输入第二个学生的名字");
        String name2 = sc.next();
        sd1.student.setName(name2);
        System.out.println("请输入第二个学生的学号");
        int id2 = sc.nextInt();
        sd1.student.setId(id2);
        System.out.println("请输入第二个学生的年龄");
        int age2 = sc.nextInt();
        sd1.student.setAge(age2);
        System.out.println("请输入第二个学生的狗狗们");
        String dogs2 = sc.next();
        sd1.setDogs(dogs2);
        System.out.println("第一个学生的名字为： "+sd.student.getName()+" 学号为： "+sd.student.getId()+" 年龄为： "+sd.student.getAge()+" 狗狗为： "+sd.getDogs());
        System.out.println("第二个学生的名字为： "+sd1.student.getName()+" 学号为： "+sd1.student.getId()+" 年龄为： "+sd1.student.getAge()+" 狗狗为： "+sd1.getDogs());
    }
}
