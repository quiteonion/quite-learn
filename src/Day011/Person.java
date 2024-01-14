package Day011;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        for (int i = 0; i < a.length(); i++) {
            char p = a.charAt(i);
            System.out.println(p);
        }
    }
}
