package A20240306;

public class Overload {
    /*public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }*/

    /* public static double add(int  a, int  b) {
        return a + b;
    }
*/
    public static int add(int... a){
        return 0;
    }

    /*public static char add(char a, char b) {
        return (char) (a + b);
    }
*/
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(add(arr));
    }

}
