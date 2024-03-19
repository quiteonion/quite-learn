package B20240317;

import java.util.StringJoiner;

public class AdjustChar {
    public static void main(String[] args) {


        String A = "abcde";
        String B = "cdeab";
        /**
         * 如果两者长度已经不相同就不需要再进行下面判断了
         */
        if (A.length() != B.length()){
            System.out.println("false");
            System.exit(-1);
        }


        /**
         * 如果两者直接相同也无需判断
         */
        StringBuilder SB = new StringBuilder();
        for (int i = 1; i < A.length(); i++) {

            String sp = SB.append(A.substring(1)).append(A.charAt(0)).toString();
            A = sp;
            if (A.equals(B)){
                System.out.println("true");
                System.exit(-1);
            }
            SB.delete(0,A.length());
        }
        System.out.println("false");

    }
}
