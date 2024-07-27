package B20240727;

import B20240428.AAA.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(25);

        arr.add(2, 12);
        System.out.println(arr.toString());
    }
}
