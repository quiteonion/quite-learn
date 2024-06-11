package B20240611;

import java.util.Arrays;

public class SystemArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = new int[10];
        System.arraycopy(arr1 , 0 , arr2 ,0 , 9 );
        System.out.println(Arrays.toString(arr2));
    }
}
