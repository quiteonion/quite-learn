package B20240526;

import java.util.Scanner;

public class Dichotomy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //实现二分法查找
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int begin = 0;
        int end = arr.length - 1;

        int findNumber = sc.nextInt();
        while (end>begin) {
            if (arr[((begin + end) / 2)] > findNumber) {
                end = ((begin + end )/ 2) - 1;
            }else if (arr[((begin + end) / 2)] < findNumber){
                begin = ((begin + end) / 2) + 1;
            }else {
                System.out.println("在数组中");
                System.exit(0);
            }
        }
        System.out.println("没有·");
    }
}
