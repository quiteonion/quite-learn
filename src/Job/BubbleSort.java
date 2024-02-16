package Job;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 3, 5, 8, 9, 0, 7, 6, 2, 4};
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length-1; i++) {
                //首先让 0 和 1 进行对比 ， 如果 0 》 1 则交换位置 ，  然后 1 和 2
                if (arr[i] > arr[1 + i]) {
                    int wuyongNumber = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = wuyongNumber;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }

    }
}
