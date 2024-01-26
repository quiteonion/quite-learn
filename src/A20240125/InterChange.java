package A20240125;

public class InterChange {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        int z;
        z = x;
        x = y;
        y = z;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
