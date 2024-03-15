package A20240313;

import java.util.Scanner;

public class Fibonacci {
    //斐波那契 练习
    public int FFF(int number) {
        if (number <= 2){
            return 1;
        }else {
            return FFF(number - 1) + FFF(number-2);
        }
    }
}





