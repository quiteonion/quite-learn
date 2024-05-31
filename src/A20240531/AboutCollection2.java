package A20240531;

import java.util.ArrayList;
import java.util.Collection;

public class AboutCollection2 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("1");
        arr.add("2");
        arr.add("3");
        System.out.println(arr);
        arr.remove("2");
        System.out.println(arr);
        System.out.println("=== === ===");
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        System.out.println(arr1);
        arr1.remove(Integer.valueOf(2));
        System.out.println(arr1);
    }
}
