package Day009;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int b =r.nextInt(100)+1;
        while(true){
            Scanner sc =new Scanner(System.in);
            int a = sc.nextInt();
            if (a == b ){
                System.out.println("yes");
            } else if (a<b) {
                System.out.println("small");
            }else {
                System.out.println("big");
            }
        }
    }
}
