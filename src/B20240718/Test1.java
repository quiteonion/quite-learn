package B20240718;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            int num = 0;
            for (int i = 0; i < arr.size(); i++) {
                num += arr.get(i);
                if (num > 200) {
                    System.out.println(num);
                    System.exit(0);
                }
            }
            int number = sc.nextInt();
            arr.add(number);
        }
    }
}
