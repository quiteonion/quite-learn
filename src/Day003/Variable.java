package Day003;

import java.util.Scanner;

//you are good boy

/*
题目：编写一个Java程序，实现以下功能：


输出结果到控制台。
要求：


对于除法运算，需要处理除数为0的情况，此时方法应返回0或抛出异常（请自行决定）。
 */

public class Variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int add_number = add(number1, number2);
        int subtract_number = subtract(number1, number2);
        int multiply_number = multiply(number1, number2);
        double divide_number = divide(number1, number2);
        System.out.println(add_number + "\n" + subtract_number + "\n" + multiply_number + "\n" + divide_number);
    }

    //       使用方法来实现上述功能，方法名分别为add、subtract、multiply和divide。
//       每个方法都应该接收两个整数作为参数，并返回相应的计算结果。
//       计算两个整数的和、差、积和商。
    public static int add(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

    public static int subtract(int a, int b) {
        int c;
        c = a - b;
        return c;
    }

    public static int multiply(int a, int b) {
        int c;
        c = a * b;
        return c;
    }

    public static double divide(int a, int b) {
        double c;
        c = (double) a / (double) b;
        return c;
    }
}
