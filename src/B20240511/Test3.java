package B20240511;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。比如:Hello12345World中字母:10个，数字:5个。
        Scanner sc = new Scanner(System.in);
        String ne = sc.next();
        int x = 0 , y = 0;
        for (int i = 0; i < ne.length(); i++) {
            char number = ne.charAt(i);
            if ((number >= 'a' && number <= 'z') || (number >= 'A' && number <='Z')) {
                x++;
            } else if (number>='1'&&number<='9') {
                y++;
            }
        }
        System.out.println("有"+x+"个字母"+y+"个数字");
    }
}
