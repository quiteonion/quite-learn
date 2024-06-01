package B20240601;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentText {
    static ArrayList<Student> arrayList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        choose();
    }

    private static void changeStudent() {
        String name1 = sc.next();
        int i = findStudent(name1);
        System.out.println(arrayList.get(i).toString());
        System.out.println("请输入更改学生的姓名");
        String name = sc.next();
        System.out.println("请输入更改学生的年龄");
        int age = sc.nextInt();
        System.out.println("请输入更改学生的班级");
        String className = sc.next();
        arrayList.set( i , new Student(name, age, className));

    }

    private static void findStudent() {
        System.out.println("请输入姓名");
        String name = sc.next();
        boolean flag = arrayList.contains(new Student(name, 0, null));
        if (flag) {
            System.out.println("该学生为");
            Iterator<Student> arr = arrayList.iterator();
            if (arr.hasNext()) {
                if (arr.next().getName().equals(name)) {
                    System.out.println(arr.next());
                }
            }
        }
        System.out.println("没有该学生");
    }

    private static int findStudent(String name) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    private static void deleteStudent() {
        System.out.println("请输入姓名");
        String name = sc.next();
        int i = findStudent(name);
        if (i > 0){
            arrayList.set(i , null);
            return;
        }
        System.out.println("没有该学生");
    }

    private static void displayStudent() {
        Iterator<Student> arr = arrayList.iterator();
        if (arrayList.size() == 0) {
            System.out.println("没有添加学生");
            return;
        }
        while (arr.hasNext()) {
            System.out.println(arr.next());
        }
    }

    private static void menu() {
        System.out.println("1、菜单");
        System.out.println("2、增加学生");
        System.out.println("3、显示所有学生");
        System.out.println("4、删除指定学生");
        System.out.println("5、查找指定学生");
        System.out.println("6、更改指定学生");
        System.out.println("7、退出系统");
    }

    private static void addStudent() {
        System.out.println("请输入添加学生的姓名");
        String name = sc.next();
        System.out.println("请输入添加学生的年龄");
        int age = sc.nextInt();
        System.out.println("请输入添加学生的班级");
        String className = sc.next();
        arrayList.add(new Student(name, age, className));
    }

    private static void choose() {
        for (; ; ) {
            menu();
            System.out.println("请选择：");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    menu();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    displayStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    findStudent();
                    break;
                case 6:
                    changeStudent();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("你的输入有误，请重新输入");
            }
        }
    }
}
