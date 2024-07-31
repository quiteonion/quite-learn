package B20240730.Test;

import java.util.IllegalFormatCodePointException;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 6, 8, 6, 2, 6, 9, 32, 7, 4, 2, 6, 8, 3};

//                   2, 1, 6, 0, 5, 7, 8, 4, 3, 9
//                   2, 1, 0, 6, 5, 7, 8, 4, 3, 9

        /**
         * 快排
         * 一半一半
         */
        m(arr, 0, arr.length - 1);
        for (int o : arr) {
            System.out.println(o);
        }
    }

    public static void m(int[] arr, int a, int b) {
        if (a > b)
            return;
        int begin = a;
        int end = b;
        int temp = a;
        while (end > begin) {
            while (arr[end] >= arr[temp] && end > begin) {
                end--;
            }
            while (arr[begin] <= arr[temp] && end > begin) {
                begin++;
            }
            int p = arr[begin];
            arr[begin] = arr[end];
            arr[end] = p;

        }
        int p = arr[temp];
        arr[temp] = arr[end];
        arr[end] = p;


        m(arr, a, end - 1);
        m(arr, end + 1, b);
    }
}
