package B20240319;

import java.util.Random;

public class Captcha {
    public static void main(String[] args) {
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

       /* for (int i = 0; i < arrChar.length; i++) {
            System.out.print(arrChar[i]+" ");
        }*/
        int[] arrNumber = {1,2,3,4,5,6,7,8,9,0};

        //至此，创建数组完毕

        Random r = new Random();
        StringBuilder SB = new StringBuilder();
        Boolean flag = true;
        //由于是4个字母 ， 字母就只使用4次循环
        //某次循环中会自动加上数字
        for (int i = 0; i < 4; i++) {
            int rd = r.nextInt(arrChar.length);
            int mun = r.nextInt(arrNumber.length);
            int nnn = r.nextInt(2);

            //随机放入数字
            //与随机索引进行交换
            //或者在这里放入随机字符就能够进行添加
            SB.append(arrChar[rd]);
            if (nnn == 1){
                if (flag){
                    SB.append(arrNumber[mun]);
                    flag = false;
                }
            }

        }

        System.out.println(SB);


    }
}
