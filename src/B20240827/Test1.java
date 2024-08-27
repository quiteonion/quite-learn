package B20240827;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntStream r = Arrays.stream(arr);
        IntStream intStream = r.filter(s -> s % 2 == 0);
        intStream.forEach(s-> System.out.println(s));
    }
}
