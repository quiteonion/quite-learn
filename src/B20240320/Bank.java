package B20240320;

import java.util.Random;
import java.util.Scanner;

public class Bank {
    private String name;
    private int age;
    private int id;
    private int password;
    private double money;
    private static final int pPassword = 1234567;


    public Bank() {
    }

    private Bank(String name, int age, int id, int password, double money) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.password = password;
        this.money = money;
    }


    //用户姓名输入
    //用户姓名的获取
    private String getName(int pPassword) {
        if (pPassword != this.password) {
            System.out.println("您的管理员密码错误！");

        }
        return name;
    }


    private void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您的姓名:" + "  ");
        String name = sc.next();
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    private int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    private void setAge(int age) {
        if (age < 0 || age > 200) {
            System.out.println("您输入的年龄有问题，请重新输入：");
            soutAge();
        }
        this.age = age;
    }

    private void soutAge() {
    }


    /**
     * 获取
     *
     * @return id
     */
    private int getId() {
        return id;
    }


    private String getPassword() {
        return "抱歉，您没有查看密码的权限";
    }

    private void setPassword(int password) {
        this.password = password;
    }


    private void setMoney(double money) {
        this.money = money;
    }


    private int getPassword(int number) {
        if (this.password == number) {
            return this.password;
        }
        System.out.println("您输入的管理员密码错误！");
        return 0;
    }



    public void menu() {
        System.out.println("1、创建账户");
        System.out.println("2、存钱");
        System.out.println("3、取钱");
        System.out.println("4、更多");
    }

    public void synthesis() {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("请选择您要办理的业务：");
            menu();

            int number = sc.nextInt();
            switch (number) {
                case 1:
                    newAccount();
                    continue;
                case 2:
                    setMoney();
                    continue;
                case 3:
                    getMoney();
                case 4:
                    more();
                    continue;
                default:
                    System.out.println("您输入有问题，请重新输入");

            }

        }
    }

    private void more() {
    }

    private void getMoney() {
    }

    private void setMoney() {
        if (money < 0) {
            System.out.println("您输入的钱可能有问题,怀疑您在进行非法操作 ， 将会 删除您的所有资金");
            this.money = 0;
            return;
        }
        this.money = money;
    }



    private Bank[] newAccount() {
        setName();
    }

    private void setPassword() {
        Random r = new Random();
        StringBuilder SB = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int id = r.nextInt(10);
            SB.append(id);
        }
        this.id = Integer.parseInt(SB.toString());
    }
}

