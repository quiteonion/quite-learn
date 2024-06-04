package B20240604;

import java.util.Scanner;

public class SelfPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean flag =  SelfJudgment(number);
        if (flag){
            System.out.println("yes");
            return;
        }
        System.out.println("no");
    }

    public static boolean SelfJudgment(int number) {
        int mun = number;
        String numberString = String.valueOf(number);
        int numberLength = numberString.length();
        int All = 0;
        for (int i = 0; i < numberLength; i++) {
            int num = number % 10;
            All += Math.pow(num, numberLength);
            number /= 10;
        }
        if (All == mun)
            return true;
        return false;

    }
}
