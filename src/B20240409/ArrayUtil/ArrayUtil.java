package B20240409.ArrayUtil;

import java.util.Arrays;

public class ArrayUtil {
    private ArrayUtil(){}
    public static String printArr(int[] arr){
        return Arrays.toString(arr);
    }


    public static void getAerage(int[] arr){
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num +=arr[i];
        }
        System.out.println(num/arr.length);
    }
}
