package B20240309;

import java.util.Scanner;

public class IDCade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your ID number");
        long IDNumber = sc.nextLong();

        String state = String.valueOf(IDNumber);

        String birdaySate = state.substring(6, 14);

        String genderNumber = state.substring(16, 17);

        System.out.println("your birday : " + birdaySate);

        int genderNumber1 = Integer.valueOf(genderNumber);
        String gender;
        if (genderNumber1%2 == 0 ){
            gender = "girl";
        }else {
            gender = "boy";
        }
        System.out.println("your gender : " + gender);
    }
}
