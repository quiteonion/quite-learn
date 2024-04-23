package B20240423;

import java.util.Scanner;

public class Invert {
    public static void main(String[] args) {
        StringBuffer SB = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String pp = sc.next();
        for (int i = 0; i < pp.length(); i++) {
            char ch = pp.charAt(i);
            String binaryString = Integer.toBinaryString((int) ch);
            SB.append(binaryString);
        }
        System.out.println(SB);
    }
}
