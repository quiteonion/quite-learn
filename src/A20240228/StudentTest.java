package A20240228;

import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        int number = 0;
        Student[] array = new Student[50];
        while (true) {
            menu();
            System.out.println("请选择你的选项");
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    displayStudent(student, array, number);
                    continue;
                case 2:
                    addStudent(student, array, number);
                    continue;
                case 3:
            }
        }
    }

    public static void menu() {
        System.out.println("-------------------------");
        System.out.println("---------- 菜单 ----------");
        System.out.println("-----1、显示所有学生--------");
        System.out.println("-----2、增加一个学生--------");
        System.out.println("-----3、删除一个学生--------");
        System.out.println("-----4、修改某个学生的信息---");
        System.out.println("-------------------------");
    }

    public static int addStudent(Student student, Student[] array, int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的姓名");
        String name = scanner.next();
        student.setName(name);
        System.out.println("请输入学生的学号");
        int id = scanner.nextInt();
        student.setId(id);
        System.out.println("请输入学生的年龄");
        int age = scanner.nextInt();
        student.setAge(age);
        System.out.println("请输入学生的性别");
        String gender = scanner.next();
        student.setGender(gender);
        array[number] = student;
        return ++number;
    }

    public static void displayStudent(Student student, Student[] array, int number) {
        if (number == 0){
            System.out.println("还没有添加学生哦！");
            System.exit(-1);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("name\nid\nage\ngender");
            System.out.println(array[i].getName()+"\n"+array[i].getId()+"\n"+array[i].getAge()+"\n"+array[i].getGender());
        }
    }
}
