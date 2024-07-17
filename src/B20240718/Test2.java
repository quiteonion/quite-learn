package B20240718;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
    public static void main(String[] args) {
        String number = "9764890";
        int i = parseInt(number);
        System.out.println(i);
    }

    private static int parseInt(String number) {
        int mun = 0;
//        Pattern p = Pattern.compile("[1-9]\\d{0,9}");
//        Matcher m = p.matcher(number);
        boolean m = number.matches("[1-9]\\d{0,9}");
        if (!m) {
            return 0;
        }
        for (int i = 0; i < number.length(); i++) {
            int n = number.charAt(i) - '0';
            mun = mun * 10 + n;
//            char c = number.charAt(i);
//            boolean o = c >= '0' && c <= '9';
//            if (!o) {
//                return 0;
//            }
//            if (c == '0') {
//                mun = mun * 10;
//            } else if (c == '1') {
//                mun = mun * 10 + 1;
//            } else if (c == '2') {
//                mun = mun * 10 + 2;
//            } else if (c == '3') {
//                mun = mun * 10 + 3;
//            } else if (c == '4') {
//                mun = mun * 10 + 4;
//            } else if (c == '5') {
//                mun = mun * 10 + 5;
//            } else if (c == '6') {
//                mun = mun * 10 + 6;
//            } else if (c == '7') {
//                mun = mun * 10 + 7;
//            } else if (c == '8') {
//                mun = mun * 10 + 8;
//            } else {
//                mun = mun * 10 + 9;
//            }

        }
        return mun;
    }
}
