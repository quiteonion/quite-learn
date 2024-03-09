package B20240309;

import java.util.Scanner;

public class PhoneNumberShield {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long phoneNumber;

        while (true) {

            System.out.println("请输入一个手机号");
            phoneNumber = sc.nextLong();

            if (phoneNumber < 100000000000L && phoneNumber > 1000000000L) {
                break;
            }

            System.out.println("输入的手机号不规范！");
        }

        /**
         * 其他数据类型转变为字符串
         * String.valueOf();
         * 或者
         * Long.toString();
         * Float.toString();
         * Integer.toString();
         * Double.toString();
         *
         * 重点！！！！！！！！！！
         *
         * 本质上
         * String.valueOf();
         * 就是调用了其他的转变方法，更加笼统和实用
         */
        String state = String.valueOf(phoneNumber);

        String beginState = state.substring(0,3);

        String endState = state.substring(7);

        String char8 = "****";

        System.out.println(beginState+char8+endState);
    }
}
