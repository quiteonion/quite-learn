package A20240306;

public class ObjectTest {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    /* public static double add(int  a, int  b) {
        return a + b;
    }
*/

    public static char add(char a, char b) {
        return (char) (a + b);
    }

    public static void main(String[] args) {
        System.out.println(add(1,2));
    }

}
