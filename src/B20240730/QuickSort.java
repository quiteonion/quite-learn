package B20240730;

import java.util.IllegalFormatCodePointException;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2, 8, 6, 0, 5, 7, 1, 4, 3, 9};
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
            while (arr[end] > arr[temp]) {
                end--;
            }
            while (arr[begin] < arr[temp]) {
                begin++;
            }
            int p = arr[begin];
            arr[begin] = arr[end];
            arr[end] = p;

        }
        int p = arr[temp];
        arr[temp] = arr[end];
        arr[end] = p;


        m(arr, a, end-1);
        m(arr, end+1, b);
    }
}
