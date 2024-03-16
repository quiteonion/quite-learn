package A20240315;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      MainTest a = new MainTest();
      String bot = a.bot();
        while(true){
            System.out.println("请输入你要出的东西");
            String he = sc.next();
            if (he.equals(bot)){
                System.out.println("平局");
                break;
            }else if ((he.equals("石头") && bot.equals("剪刀")) ||
                    (he.equals("剪刀") && bot.equals("布")) ||
                    (he.equals("布") &&bot.equals("石头"))){
                System.out.println("你赢了");
            }else {
                System.out.println("你输了");
            }
        }
    }
}
