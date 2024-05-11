package B20240511;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。
        // 请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。规则为:号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。
        StringBuffer SB = new StringBuffer();
        String ID = new Scanner(System.in).next();
        boolean flag = true;
        if (ID.length() == 17) {
            if ((ID.charAt(ID.length()) >= '1' && ID.charAt(ID.length()) <= '9') || ID.charAt(ID.length()) == 'X')
                for (int i = 0; i < ID.length() - 1; i++) {
                    char c = ID.charAt(i);
                    if (c < '1' || c > '9') {
                        System.out.println("cuowu");
                        System.exit(0);
                        flag = false;
                    }
                }
            if (flag){
                System.out.println("win");
                System.exit(0);
            }
        }
        System.out.println("cuowu");
    }
}
