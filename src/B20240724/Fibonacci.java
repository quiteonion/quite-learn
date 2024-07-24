package B20240724;

public class Fibonacci {
    public static void main(String[] args) {
        /**
         * 斐波那契
         * 从 1 到 100
         */
        int number = fibonacci(6);
        System.out.println(number);
    }

    public static int fibonacci(int number) {
        if (number == 1) {
            return 1;
        } else {
            return fibonacci(number - 1) + number;
        }
    }
}
