package B20240723;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo {
    public static void main(String[] args) {
        Integer[] arr = {2, 4, 1, 3, 8, 5, 9, 6, 7, 0};
        //完整格式
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
            return o1 - o2;
            }
        );
        //省略格式
        Arrays.sort(arr, (o1, o2) -> {
                    return o1 - o2;
                }
        );//省略格式
        Arrays.sort(arr, (o1, o2) -> o2 - o1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
