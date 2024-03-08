package B20240305;

import java.util.Scanner;

public class inspect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String a = sc.next();

        int big = 0, small = 0, number = 0;
        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            if (b >= 'A' && b <= 'Z') {
                big++;
            } else if (b >= 'a' && b <= 'z') {
                small++;
            } else if (b >= '0' && b <= '9') {
                number++;
            }
        }
        System.out.println(big + " " + small + " " + number);
    }
}
