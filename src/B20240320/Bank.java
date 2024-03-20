package B20240320;

import java.util.Random;
import java.util.Scanner;

public class Bank {
    private String name;
    private int age;
    private int id;
    private int password;
    private  double money;
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
    public String getName(int pPassword) {
        if (pPassword != this.password){
            System.out.println("您的管理员密码错误！");

        }
        return name;
    }


    private void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您的姓名:"+"  ");
        String name = sc.next();
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    private void setAge(int age) {
        if (age<0||age>200){
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
    public int getId() {
        return id;
    }


    private void setId() {
        Random r = new Random();
        StringBuilder SB = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int id = r.nextInt(10);
            SB.append(id);
        }
        this.id = Integer.parseInt(SB.toString());
    }


    public double getMoney() {
        return money;
    }


    private String getPassword() {
        return "抱歉，您没有查看密码的权限";
    }

    public void setPassword(int password) {
        this.password = password;
    }


    private void setMoney(double money) {
        this.money = money;
    }


    public int getPassword(int number) {
        if (this.password == number) {
            return this.password;
        }
        System.out.println("您输入的管理员密码错误！");
        return 0;
    }


    public void fetchMoney() {
        if (money < 0) {
            System.out.println("您输入的钱可能有问题,怀疑您在进行非法操作 ， 将会 删除您的所有资金");
            this.money = 0;
            return;
        }
        this.money = money;
    }

    public void menu(){
        System.out.println("请选择您要办理的业务：");
    }


}

