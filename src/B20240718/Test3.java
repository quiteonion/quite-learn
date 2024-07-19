package B20240718;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /**
         * 10%2 == 0
         *
         *
         */
        int number = new Scanner(System.in).nextInt();
        StringBuilder sb = new StringBuilder();
        while (number != 0) {
            if (number % 2 == 0){
                sb.append(0);
            } else {
                sb.append(1);
            }
            number /= 2;
        }
        System.out.println(sb.reverse());
    }
}
