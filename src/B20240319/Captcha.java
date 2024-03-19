package B20240319;

public class Captcha {
    public static void main(String[] args) {
        StringBuilder SB = new StringBuilder();
        char[] arrChar = new char[52];
        //创建一个字符数组
        /**
         * 错误的创建
         * arr = {'a','b','c','d'.............,'Z'};
         * 笨而且低效
         */
        for (int i = 0; i < 26; i++) {
            arrChar[i] = (char) ('a' + i);
        }
        for (int i =26 ; i < 52; i++) {
            arrChar[i] = (char) ('A'+i-26);
        }

        for (int i = 0; i < arrChar.length; i++) {
            System.out.print(arrChar[i]+" ");
        }
        int[] arrNumber = {1,2,3,4,5,6,7,8,9,0};

        //至此，创建数组完毕
    }
}
