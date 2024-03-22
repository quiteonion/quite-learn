package A20240322;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> AL = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入一个您的精灵的名称");
            String name = sc.next();
            AL.add(name);
            System.out.println("是否继续添加？");
            int number = sc.nextInt();
            if (number == 1) {
                break;
            }
        }

        System.out.println(Arrays.toString(AL.toArray()));
        System.out.println(AL.toString());
        System.out.println(AL);

    }
}
