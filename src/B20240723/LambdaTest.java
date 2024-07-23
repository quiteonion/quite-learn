package B20240723;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaTest {
    public static void main(String[] args) {
        String[] arr = {"af", "gaggash", "GAQEG", "gbsdhbhsb", "Asg", "adgga"};
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());
        System.out.println(Arrays.toString(arr));
    }
}
