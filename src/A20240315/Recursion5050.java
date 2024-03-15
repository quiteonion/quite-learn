package A20240315;

public class Recursion5050 {
    int i = 1;
    public int cycle(int number){
       if (number<=1){
           return 1;
       }else {
           return number+cycle(number-1);
       }
    }
}
