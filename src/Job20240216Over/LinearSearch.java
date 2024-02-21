package Job20240216Over;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,9,0,7,6,2,4};
        //已知一个数组，要求输入要查找的数字，如果存在Z则显示下标并输出

        //键盘录入必须要
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要查找的元素");
        int Number = scanner.nextInt();

        //接下来是要遍历整个数组，对其进行对比
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        //在遍历情况下进行对比  只有相同才会输出

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (Number == arr[i]){
                System.out.println(arr[i]);
                flag = true;
            }
        }

        //如果不存在？则需要先查找后判断他是否存在
        if (!flag){
            System.out.println("这个数字不存在于该数组中");
        }

    }
}
