package B20240812;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] students = {"小明","小红","小刚","小智","小梦","小如","小林","小王","小张","小七","小米","小鸡","小康","小呆","小帅","小妹","小小","大咯"};
        int i = random.nextInt(students.length);
        System.out.println(students[i]);
    }
}
