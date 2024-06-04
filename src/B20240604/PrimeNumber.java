package B20240604;

import B20240402.Number;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //怎么求一个数是不是质数
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean flag = PrimeJudgment(number);
        if (flag){
            System.out.println("不是质数");
            return;
        }
        System.out.println("是质数");
    }

    public static boolean PrimeJudgment(double number) {
        for (int i = 0; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return true;
        }
        return false;
    }
}
