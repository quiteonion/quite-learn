package Day008;

import java.util.Scanner;

public class WhileIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (i <= 100){
            if (i %2 == 0){
                System.out.print(i + " " );
            }
            i++;
        }
    }
}
