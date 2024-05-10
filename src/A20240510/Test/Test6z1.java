package A20240510.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test6z1 {
    static ArrayList<Goods> arr = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            menu();
            int number = new Scanner(System.in).nextInt();
            switch (number) {
                case 1:
                    menu();
                    break;
                case 2:
                    Storage();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    delete();
                    break;
                default:
                    System.out.println("重选！");
                    break;
            }
        }

    }

    public static void menu() {
        System.out.println(" 1.首页");
        System.out.println(" 2.入库");
        System.out.println(" 3.显示");
        System.out.println(" 4.删除");
    }

    public static void Storage() {
        System.out.println("名称");
        String name = sc.next();
        System.out.println("颜色");
        String color = sc.next();
        System.out.println("价格");
        double price = sc.nextDouble();
        System.out.println("数量");
        int number = sc.nextInt();
        arr.add(new Goods(name, color, price, number));
    }

    public static void display() {
        for (Goods g : arr){
            System.out.println(g);
        }
    }

    public static void delete() {
        display();
        System.out.println("name");
        String name = sc.next();
        boolean flag = true;
        for (int i = 0; i < arr.size(); i++) {
            if (name.equals(arr.get(i).name)){
                arr.remove(i);
                flag = false;
            }
        }
        if (flag){
            System.out.println("没有");
        }
    }
}

class Goods {
    String name;
    String color;
    double price;
    int number;

    public Goods() {
    }

    public Goods(String name, String color, double price, int number) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.number = number;
    }

    @Override
    public String toString() {
        return "name:" + this.name + "  color:" + this.color + "  price:" + this.price + "  number:" + this.number;
    }
}
