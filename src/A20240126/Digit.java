package A20240126;

import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数的数字");
        int into = sc.nextInt();
        if (into < 1000) {
            int in;
            for (int i = 1; i <= 3; i++) {
                in = into % 10;
                into /= 10;
                help(i, in);
            }
           /* while (into > 0 ){

            }*/
        } else {
            System.out.println("您给的数字已经大于三位数了！请重新输入");
        }
    }

    public static void help(int i, int in) {
        switch (i) {
            case 1:
                System.out.println("个位数为" + in);break;
            case 2:
                System.out.println("十位数为" + in);break;
            case 3:
                System.out.println("百分位为" + in);break;
        }
    }
}
