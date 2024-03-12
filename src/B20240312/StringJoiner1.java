package B20240312;

import java.util.StringJoiner;

public class StringJoiner1 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",");
        System.out.println(sj);
        String a = "qwer";
        sj.add(a);
        System.out.println(sj);
        sj.toString();
        System.out.println(sj);
    }
}
