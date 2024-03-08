package A20240306;

import java.util.Scanner;

public class AmountConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String n = "";
        while (number > 0) {
            int num = number % 10;
            String m = conversion(num);
            n = m + n;
            number /= 10;
        }

        String zero = "零";
        for (int i = 0; i < 7; i++) {
            if (n.length() < 7) {
                n = zero + n;
            }
        }
        System.out.println(unit(n));
    }

    public static String conversion(int num) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[num];
    }
    public static String unit(String n) {
        String niu = "";
        //               0      0     0      0      1     2      3
        String[] arr = {"佰" , "拾" , "万" , "仟" , "佰" , "拾" , "元"};
        for (int i = 0; i < 7; i++) {
            niu = niu+n.charAt(i) + arr[i] ;
        }
        return niu;
    }
}
