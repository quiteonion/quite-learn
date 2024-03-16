package A20240315;

import java.util.Random;
import java.util.Scanner;

public class MainTest {
    Random r = new Random();
    private static final  String[] arr = {"剪刀", "布","石头"};
    int m = r.nextInt();

    public String bot(){
        return arr[m];
    }
}
