package B20240309;

import java.util.Scanner;

public class PhoneNumberShield {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number;
        while (true) {
            System.out.println("请输入一个手机号");
            number = sc.next();
            if (number.length() != 11) {
                System.out.println("输入的手机号不规范！");
                continue;
            }
            break;
        }
        for (int i = 0; i < number.length(); i++) {

        }
    }
}
