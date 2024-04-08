package B20240328;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentTest {
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    static ArrayList<Student> studentArray = new ArrayList<>();


    public static void main(String[] args) {
        mainMenu();

    }


    public static void mainMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Frontandbackend();
            System.out.println("请输入要进入的程序");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    studentSystem();
                    break;
                case 2:
                    teacherSystem();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("您输入有误请重新输入");
            }
        }
    }

    private static void teacherSystem() {
        teacherMenu();
    }


    private static void studentSystem() {

        boolean flag = true;
        while (flag) {
            studentMenu();
            System.out.println("请输入要进入的程序");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    addStudent(studentArray);
                    break;
                case 2:
                    inquire(studentArray);
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("您输入有误请重新输入");
            }
        }


    }

    private static void addStudent(ArrayList<Student> studentArray) {
        Student s = new Student();
        System.out.println("请输入您的姓名");
        String name = sc.next();
        s.setName(name);
        System.out.println("请输入您的年龄");
        int age = sc.nextInt();
        s.setAge(age);
        System.out.println("请输入您的性别");
        String gender = sc.next();
        s.setName(gender);

        while (true) {
            System.out.println("请输入你的手机号码");
            Long phoneNumber = sc.nextLong();
            if (phoneNumber >= 10000000000L && phoneNumber <= 99999999999L) {
                break;
            }
            System.out.println("输入有误，请重新输入");
        }

        while (true) {
            System.out.println("请输入你的身份证");
            Long idNumber = sc.nextLong();
            if (idNumber >= 100000000000000000L && idNumber <= 999999999999999999L) {
                break;
            }
            System.out.println("输入有误，请重新输入");
        }
        while (true) {
            System.out.println(Captcha());
            System.out.println("请输入验证码");
            String captcha = sc.next();
            if (captcha.equals(Captcha())){
                System.out.println("输入正确");
                break;
            }
            System.out.println("您输入有误，请重新输入");
        }

        /**
         * 学号的自动放置失败，要重新放置
         */
        System.out.println("您的学号为" + s.getId());
        studentArray.add(s);

    }

    public static void Frontandbackend() {
        System.out.println("1、学生成绩查询");
        System.out.println("2、教师管理");
        System.out.println("3、退出系统");
    }


    public static void studentMenu() {
        System.out.println("-------------------------");
        System.out.println("---------- 菜单 ----------");
        System.out.println("-----1、注册--------------");
        System.out.println("-----2、查询成绩-----------");
        System.out.println("-----3、退出系统-----------");
        System.out.println("-------------------------");
    }

    public static void teacherMenu() {
        System.out.println("-------------------------");
        System.out.println("---------- 菜单 ----------");
        System.out.println("-----1、显示所有学生--------");
        System.out.println("-----2、增加一个学生--------");
        System.out.println("-----3、删除一个学生--------");
        System.out.println("-----4、修改学生的信息------");
        System.out.println("-----5、查找学生的信息------");
        System.out.println("-----6、退出系统-----------");
        System.out.println("-------------------------");
    }

    public static void inquire(ArrayList<Student> studentArray) {
        for (int i = 0; i < studentArray.toArray().length; i++) {
            if (studentArray != null) {
                System.out.print("姓名：  " + studentArray.get(i).getName());
                System.out.print("年龄：  " + studentArray.get(i).getAge());
                System.out.print("学号：  " + studentArray.get(i).getId());
                System.out.print("语文成绩：  " + studentArray.get(i).getChineseGrades());
                System.out.print("数学成绩：  " + studentArray.get(i).getMathGrades());
                System.out.print("英语成绩：  " + studentArray.get(i).getEnglishGrades());
                System.out.println();
            }
        }
    }

    public static String Captcha() {
        String[] arr = new String[5];
return "0-";
    }

}

