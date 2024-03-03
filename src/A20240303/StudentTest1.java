package A20240303;

import java.util.Random;
import java.util.Scanner;

public class StudentTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        Student1[] arr = new Student1[20];
        for (int i = 0; i < arr.length; i++) {
            Student1 s = new Student1();
            int state = r.nextInt(6)+1;
            int score = r.nextInt(100)+1;
            s.setId(i+1);
            s.setScore(score);
            s.setState(state);

            arr[i] = s;
        }
        System.out.println("扣二打印二年级学生信息");
        int number = sc.nextInt();
        Student1.displayStudent(number,arr);
        System.out.println("排序结果");
        Student1.sort(number , arr);
    }
}
