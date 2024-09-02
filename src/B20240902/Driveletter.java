package B20240902;

import java.io.File;
import java.util.Arrays;

public class Driveletter {
    public static void main(String[] args) {
        String s = "D:\\";
        File file = new File(s);
        String[] list = file.list();
        System.out.println(Arrays.toString(list));
    }
}
