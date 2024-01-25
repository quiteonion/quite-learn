package A20240125;

import java.util.Scanner;

public class ExchangeRateConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择您所要进行换算的钱币");
        help();
        while (true) {
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("换算的结果为" + RMB() + "刀乐");

                    break;
                case 2:
                    System.out.println("换算的结果为" + DOLE() + "软妹币");
                    break;
                default:
                    System.out.println("您输入的数值有错误！请重新输入");
                    continue;
            }
        }
    }

    public static void help() {
        System.out.println("1、软妹币");
        System.out.println("2、刀乐");
    }

    public static double RMB() {
        Scanner sc = new Scanner(System.in);
        double Exchange = 7.1522;
        System.out.println("换算前的软妹币：");
        double RmbNumber = sc.nextInt();
        double number = RmbNumber / Exchange;
        return number;
    }

    public static double DOLE() {
        Scanner sc = new Scanner(System.in);
        double Exchange = 7.1522;
        System.out.println("换算前的刀乐：");
        double RmbNumber = sc.nextInt();
        double number = RmbNumber * Exchange;
        return number;
    }
}
