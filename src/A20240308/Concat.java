package A20240308;

import java.util.Arrays;

public class Concat {
    public static void main(String[] args) {
        String[] arr = {"12", "qf", "41"};
        String[] arr1 = {"12", "qf", "41"};
        String[] arr2 = {"12", "qf", "41"};
        String o = "124";
        String o1 = "124";
        String o2 = "124";
        String o3 = "124";
        String o4 = "124";
        m(o, o1, o2, o3, o4 );
        m(arr);
        m(arr , arr1 , arr2);
    }

    public static void m(Object... m) {
        System.out.println(Arrays.toString(m));
    }
}
