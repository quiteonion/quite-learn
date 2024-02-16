package Job;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean flag = true;
        System.out.print("请输入您要查找的数字：");
        int guessNumber = sc.nextInt();
        int zuo = 0;
        int you = arr.length;
        int number = arr.length / 2;
        while (zuo != you) {
            if (guessNumber == arr[number]) {
                System.out.println("您查找的数字存在于数组中，下标为 " + number);
                flag = false;
                break;
            }
            if (guessNumber > arr[number]) {
                zuo = number + 1;
                number = (you + number) / 2;
                continue;
            }
            if (guessNumber < arr[number]) {
                you = number - 1;
                number = (zuo + number) / 2;
                continue;
            }
        }
        if (flag) {
            System.out.println("您查找的数字不存在");
        }
    }
}
