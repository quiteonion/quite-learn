package B20240721;

public class Recursive {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(m(number));
    }

    public static int m(int number) {
        if (number == 1) {
            return 1;
        } else {
            return m(number - 1) * number;
        }
    }
}
