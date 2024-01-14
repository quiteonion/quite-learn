package Day011;

import java.util.Scanner;

//遍历字符串，并写出大写字母，小写字母，和数字各出现几次
public class Person {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = 0, small = 0, big = 0;
        String a = sc.next();
        for (int i = 0; i < a.length(); i++) {
            char p = a.charAt(i);
            System.out.println(p);
            if (p >= 'A' && p <= 'Z') {
                big++;
            } else if (p >= 'a' && p <= 'z') {
                small++;
            } else {
                number++;
            }
        }
        System.out.println("数字" + number + "小写" + small + "大写" + big);
    }
}
