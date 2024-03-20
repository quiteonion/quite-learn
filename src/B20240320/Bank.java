package B20240320;

import java.util.Random;
import java.util.Scanner;

public class Bank {
    Bank b = new Bank();
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
    private String getName() {
        return name;
    }


    private void setName(String name) {
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
        this.age = age;
    }


    /**
     * 获取
     *
     * @return id
     */
    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public int getPassword(){
        return this.password;
    }


    private void setPassword(int password) {
        this.password = password;
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


    //创建账户并返回地址值
    private Bank newAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您的姓名:" + "  ");
        String name = sc.next();
        setName(name);


        while (true) {
            System.out.println("请输入您的年龄");
            int age = sc.nextInt();
            if (age < 0 || age > 200) {
                System.out.println("您输入的年龄有问题，请重新输入：");
            } else {
                setAge(age);
                break;
            }
        }


        Random r = new Random();
        int id;
        StringBuilder SB = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            id = r.nextInt(10);
            SB.append(id);
        }
        setId(Integer.parseInt(SB.toString()));


        while (true){
            System.out.println("请输入您的密码（6位数密码）");
            int password = sc.nextInt();
            if (password<0||password>999999){
                System.out.println("您的密码输入有误");
            }else {
                setPassword(password);
                break;
            }
        }

        return b;
    }



}

