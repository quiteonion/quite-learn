package B20240724;


public class Monkeys {


    public static void main(String[] args) {
        System.out.println(m(10));
    }

    /**
     * 10       1
     * 9   (    1           +1)  *2
     * 8   (    (1+1)*2     +1)  *2
     */

    public static int m(int day) {
        if (day == 1) {
            return 1;
        }
        return (m(day - 1) + 1) * 2;
    }
}
