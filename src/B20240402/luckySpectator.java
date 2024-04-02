package B20240402;

import java.util.Random;
import java.util.Scanner;

public class luckySpectator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String[] arr = new String[3];
        System.out.println("请输入三个观众的姓名");
        for (int i = 0; i < arr.length; i++) {
            String name = sc.next();
            arr[i] = name;
        }
        System.out.println("观众为");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("幸运观众是");
        int number = r.nextInt(arr.length);
        System.out.println(arr[number]);
    }
}




