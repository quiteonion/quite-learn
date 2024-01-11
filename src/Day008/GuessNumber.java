package Day008;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int GuessNumber0 = r.nextInt(100) + 1;
        int a = 5;
        while (true) {
            System.out.print("请输入你认为正确的答案：");
            int number = sc.nextInt();
            if (a != 0) {
                if (number == GuessNumber0) {
                    System.out.println("恭喜你猜对了");
                    break;
                } else {
                    if (number > GuessNumber0){
                        System.out.print("你输入的数字太大了！");
                    }else {
                        System.out.print("你输入的数字太小了！");
                    }
                    System.out.println("你还剩下" + a + "次机会");
                    a -= 1;
                }
            }else {
                System.out.println("你已经失去了所有的机会，答案是" + GuessNumber0 + "，下次努力！");
                break;
            }
        }


    }
}
