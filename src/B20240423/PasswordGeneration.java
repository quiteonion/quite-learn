package B20240423;

import java.util.Scanner;

public class PasswordGeneration {
    public static void main(String[] args) {
        StringBuffer SB = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        System.out.println("账号");
        int number = sc.nextInt();
        SB.append(number);
        System.out.println("密码为");
        System.out.println(SB.reverse());
    }
}
