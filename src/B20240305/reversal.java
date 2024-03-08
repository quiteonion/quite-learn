package B20240305;

import java.util.Scanner;

public class reversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String a = sc.next();
        String qwe = str(a);
        System.out.println(qwe);
    }

    public static String str(String a) {
        String n = "";
        for (int i = a.length()-1; i >=0 ; i--) {
            char j = a.charAt(i);
            n = n + j;
        }
        return n;
    }
}
