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

    public Bank(String name, int age, int id, double money) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.money = money;
    }

    public Bank(String name, int age, int id, int password, double money) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.password = password;
        this.money = money;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
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
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return money
     */
    public double getMoney() {
        return money;
    }

    /**
     * 设置
     *
     * @param money
     */


    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return "抱歉，您没有查看密码的权限";
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(int password) {
        this.password = password;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(double money) {
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


    public void load(){
        Scanner sc = new Scanner(System.in);

    }

}

