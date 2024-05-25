package A20240308;

import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String separate;
        while (true) {
            System.out.println("请输入你所想要用作分隔符的字符（只能是一个！）");
            separate = sc.next();
            if (separate.length() == 1) {
                break;
            }
            System.out.println("您的输入格式有误，请重新输入！");
        }

        System.out.println("请输入一串字符串");
        String concat = sc.next();
        String m = con(separate, concat, "你好", "世界", "!");
        System.out.println(m);

    }

    public static String con(String... concat) {
        String m = "";
        for (int i = 1; i < concat.length - 1; i++) {
            m = m + concat[i] + concat[0];
        }
        m = m + concat[concat.length];
        return m;
    }
}
