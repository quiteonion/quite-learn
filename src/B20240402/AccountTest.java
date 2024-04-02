package B20240402;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountTest {
    static ArrayList<Account> arr = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        while (true) {
            menu();
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    login1();
                    break;
                case 2:
                     enroll();
                    break;
                case 3:
                    display();
                    break;
                default:
                    System.out.println("输入错误");
            }
        }


    }

    private static void login1() {
        Account a = new Account();
        System.out.println("用户名");
        String userName = sc.next();
        a.setUserName(userName);
        System.out.println("密码");
        String password = sc.next();
        a.setPassword(password);
        arr.add(a);
    }

    private static void enroll() {
        System.out.println("用户名");
        String userName = sc.next();
        System.out.println("密码");
        String password = sc.next();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getUserName().equals(userName) && arr.get(i).getPassword().equals(password)) {
                System.out.println("登陆成功");
                System.exit(0);
            }
        }
        System.out.println("用户名或密码错误");
    }

    public static void display() {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("用户名" + arr.get(i).getUserName());
            System.out.println("密码" + arr.get(i).getPassword());
        }
    }

    private static void menu() {
        System.out.println("1、注册");
        System.out.println("2、登录");
        System.out.println("3、查看");
    }
}
