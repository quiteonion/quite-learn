package Job;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,5,8,9,0,7,6,2,4};
        boolean flag = true;
        System.out.print("请输入您要查找的数字：");
        int number = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]){
                System.out.println("您查找的数字存在于数组中，下标为" + i);
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("您查找的数字不存在");
        }
    }
}
