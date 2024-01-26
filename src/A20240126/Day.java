package A20240126;

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*        String[] arr = new String[7];*/
        String[] arr = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"};
        while (true){
            int into = sc.nextInt();
            if (into > 7){
                System.out.println("不存在");
                continue;
            }
            System.out.println(arr[into - 1]);
        }

    }
}
