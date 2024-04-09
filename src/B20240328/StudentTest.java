package B20240328;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentTest {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> arr = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            menu();
            int number = sc.nextByte();
            switch (number) {
                case 1:
                    login();
                    break;
                case 2:
                    enroll();
                    break;
                case 3:
                    forgetPassword();
                    break;
                default:
                    System.out.println("你的输入有错误");
            }
        }
    }

    private static void forgetPassword() {
        System.out.println("请输入你的手机号码");
        long phoneNumber = sc.nextLong();
        int i = display(phoneNumber);
        if (i != -1) {
            System.out.println("请输入你的用户名");
            String name = sc.next();
            if (arr.get(i).getName().equals(name)) {
                System.out.println("请输入你的身份证号码");
                long idNumber = sc.nextLong();
                if (arr.get(i).getIdCard() == idNumber) {
                    System.out.println("请重新输入密码");
                    String password = sc.next();
                    arr.get(i).setPassword(password);
                }
            }
        }
    }

    private static void enroll() {
        Student s = new Student();
        System.out.println("请输入你的用户名");
        String name = sc.next();
        s.setName(name);
        System.out.println("请输入你的密码");
        String password = sc.next();
        s.setPassword(password);
        System.out.println("请输入你的身份证（仅用于验证）");
        while (true) {
            long idCard = sc.nextLong();
            if (idCard >= 100000000000000000L && idCard < 1000000000000000000L) {
                s.setIdCard(idCard);
                break;
            }
            System.out.println("输入不符合规范");
        }

        System.out.println("请输入你的手机号码");
        while (true) {
            long phoneNumber = sc.nextLong();
            if (phoneNumber >= 10000000000L && phoneNumber < 100000000000L) {
                s.setPhoneNumber(phoneNumber);
                break;
            }
            System.out.println("输入不符合规范");
        }
        System.out.println("请输入验证码");
        String c = Captcha();
        System.out.println(c);
        while (true) {
            String captacha = sc.next();
            if (captacha.equals(c)) {
                arr.add(s);
                return;
            }
            System.out.println("输入错误");
        }

    }

    private static void login() {
        if (arr.size() == 0){
            System.out.println("请先注册");
            return;
        }
        System.out.println("请输入你的手机号码");
        long phoneNumber = sc.nextLong();
        int i = display(phoneNumber);
        if (i != -1) {
            System.out.println("请输入你的用户名");
            String name = sc.next();
            if (arr.get(i).getName().equals(name)) {
                System.out.println("请输入你的密码");
                String numer = sc.next();
                if (arr.get(i).getPassword().equals(numer)){
                    System.out.println("登录成功");

                }
            }
        }

    }

    public static void menu() {
        System.out.println("欢迎来到学生管理系统");
        System.out.println("1、登录");
        System.out.println("2、注册");
        System.out.println("3、忘记密码");
    }

    public static int display(long phoneNumber) {
        boolean flag = true;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getPhoneNumber() == phoneNumber) {
                return i;
            }
            flag = false;
        }
        if (flag) {
            System.out.println("没有找到该号码");
        }
        return -1;
    }

    public static String Captcha() {
        char[] arr = new char[5];

        char[] arrayList = new char[52];
        Random r = new Random();

        for (int i = 0; i < 26; i++) {

            char a = (char) (i + 'a');
            arrayList[i] = a;
        }

        for (int i = 26, j = 0; i < 52; i++, j++) {
            char A = (char) (j + 'A');
            arrayList[i] = A;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int charnumber = r.nextInt(52);
            arr[i] = arrayList[charnumber];
        }
        char[] numberArr = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        int number = r.nextInt(numberArr.length);
        int arrNumber = r.nextInt(arr.length);
        char i = arr[arrNumber];
        arr[arrNumber] = numberArr[number];
        arr[arr.length - 1] = i;
        String ARR = String.valueOf(arr);

        return ARR;
    }
}
