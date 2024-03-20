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

    private double getMoney() {
        return this.money;
    }

    private void setMoney(double money) {
        this.money = money;
    }


    public int getPassword() {
        return this.password;
    }


    private void setPassword(int password) {
        this.password = password;
    }


    public void menu() {
        System.out.println("1、创建账户");
        System.out.println("2、取钱");
        System.out.println("3、存钱");
        System.out.println("4、查看当前金额");
        System.out.println("5、忘记密码");
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
                    intoMoney();
                    continue;
                case 3:
                    fetchMoney();
                    continue;
                case 4:
                    lookMoney();
                    continue;
                case 5:
                    more();
                    continue;
                default:
                    System.out.println("您输入有问题，请重新输入");

            }

        }
    }

    private void fetchMoney() {
        boolean flag = idAndPassword();
        if (flag){
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入您要存入的钱数:" + "  ");
            double money = sc.nextDouble();
            if (money < 0) {
                System.out.println("您输入的钱可能有问题");
            } else {
                setMoney(money);
            }
        }else {
            System.out.println("账号密码错误");
        }
    }

    private void intoMoney() {
        Scanner sc = new Scanner(System.in);
        boolean flag = idAndPassword();
        if (flag) {
            System.out.println("请问您要取多少钱出来？");
            double money = sc.nextDouble();
            if (this.money < money) {
                System.out.println("您没有那么多钱");
            } else {
                this.money = this.money - money;
                System.out.println("已为您取出");
            }
        } else {
            System.out.println("账号密码错误");
        }
    }


    private void lookMoney() {
        boolean flag = idAndPassword();
        if (flag) {
            System.out.println("账户名称：" + getName());
            System.out.println("用户年龄：" + getAge());
            System.out.println("账户id：" + getId());
            System.out.println("当前金额：" + getMoney());
        } else {
            System.out.println("账号密码错误");
        }

    }

    private void more() {
        System.out.println("请输入管理员密码");
        Scanner sc = new Scanner(System.in);
        int pPassword = sc.nextInt();
        if (this.pPassword == pPassword) {
            System.out.println("账户名称：" + getName());
            System.out.println("用户年龄：" + getAge());
            System.out.println("账户id：" + getId());
            System.out.println("账户密码：" + getPassword());
        } else {
            System.out.println("管理员密码错误");
        }

    }


    //创建账户并返回地址值
    private void newAccount() {
        Bank b = new Bank();
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


        while (true) {
            System.out.println("请输入您的密码（6位数密码）");
            int password = sc.nextInt();
            if (password < 0 || password > 999999) {
                System.out.println("您的密码输入有误");
            } else {
                setPassword(password);
                break;
            }
        }

        System.out.println("您的id是" + getId());


    }


    public boolean idAndPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的id：");
        int id = sc.nextInt();
        System.out.println("请输入您的密码：");
        int password = sc.nextInt();
            if (id == this.id && password == this.password) {
                return true;
            }

        return false;

    }
}

