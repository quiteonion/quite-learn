package Day007;

import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        /*
        要求：

        程序需要能够接受用户输入的两个数字和一个运算符。
        程序需要根据用户输入的运算符进行相应的运算，并输出结果。

        提示：
        使用Java中的Scanner类来获取用户输入。
        使用Java中的String类来处理运算符。
        根据运算符进行相应的运算，可以使用Java中的Math类来进行数学运算。
        */
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("请输入两个数字进行运算");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("亲输入运算的符号：（ + - * / ）");
        String c = sc.next();
        if (c.equals("+")){
            System.out.println("两数之和为：" + (a+b));
        }else if (c.equals("-")){
            System.out.println("两数之差为：" + (a-b));
        } else if (c.equals("*")) {
            System.out.println("两数之积为：" + (a*b));
        }else if(c.equals("/")){
            System.out.println("两数之商为：" + ((double)a/(double)b));
        }else{
            System.out.println("输入有误！");
        }
    }
}
