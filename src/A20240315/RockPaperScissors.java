package A20240315;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String[] arr = {"石头" , "剪刀" , "布"};
        int cot = r.nextInt(3);
        while(true){
            System.out.println("请输入你要出的东西");
            String he = sc.next();
            if (he.equals(arr[cot])){
                System.out.println("平局");
                break;
            }else if ((he.equals("石头") && arr[cot].equals("剪刀")) ||
                    (he.equals("剪刀") && arr[cot].equals("布")) ||
                    (he.equals("布") && arr[cot].equals("石头"))){
                System.out.println("你赢了");
            }else {
                System.out.println("你输了");
            }
        }
    }

   
}
