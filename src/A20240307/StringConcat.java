package A20240307;

import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入你所想要用作分隔符的字符（只能是一个！）");
            String separate = sc.next();
            if (separate.length() == 1){
                break;
            }
            System.out.println("您的输入格式有误，请重新输入！");
        }

    }
}
