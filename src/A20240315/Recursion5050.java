package A20240315;

public class Recursion5050 {

    /*public int cycle(int number){
       if (number<=1){
           return 1;
       }else {
           return number+cycle(number-1);
       }
    }*/
    public int factorial(int number) {
        if (number > 1) {
            return number * factorial(number - 1);
        } else {
            return 1;
        }
    }
}
