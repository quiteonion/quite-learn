package B20240320;

import java.util.Random;
import java.util.Scanner;

public class Bank {
    private String name;
    private int age;
    private int id;
    private int password;
    private  double money;



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

}

