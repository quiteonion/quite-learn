package A20240317;

import java.util.Random;

public class Card1 {


        // 一张扑克牌有两个属性： 数字  和  花色

        Random r = new Random();
        /**
         * 要让数字随机生成 ， 并让他匹配上对应的花色
         * 随机扑克牌
         */
   /* int n = r.nextInt(13) + 1;
    int p = r.nextInt(4);
    private static final String[] arr = {"♥", "♣", "♠", "♦"};*/
    /*private String decors;
    private int number;*/
   /* public String getCard() {
        String m = arr[p]+" "+ n;
        return m;
    }*/
        /**
         * 扑克牌共有52张数字 2张大小王
         */






/*

   private static final String[] arrCard = new String[52];
    private static final String[] arrDecors = {"♥", "♣", "♠", "♦"};
    */
/**
 * 同一数字花色不能有重复
 * @return
 *//*
         */
        /*


         *//*
         */
        /**
         * 方法一：创建扑克牌后再打乱花色
         *
         * @return
         *//*

    private String[] setCard() {

        int k = 0;

        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j < 4; j++) {
                arrCard[k] = arrDecors[j] + " " + i;System.out.println(arrCard[k]);
                k++;
            }
        }

        return arrCard;
    }

    public String[] getCard() {
        return setCard();
    }





*/

        private static final String[] arrCard;
        private static final String[] arrDecors = {"♥", "♣", "♠", "♦"};
        /**
         * 同一数字花色不能有重复
         * @return
         */


        /**
         * 方法一：创建扑克牌后再打乱花色
         *
         * @return
         */
        static {
            arrCard = new String[52];
            int k = 0;

            for (int i = 1; i <= 13; i++) {
                for (int j = 0; j < 4; j++) {
                    arrCard[k] = arrDecors[j] + " " + i;
                    k++;

                }
            }

        }

        /**
         * 改变
         * 1 、 11 、12、13
         */

        public String[] getCard() {
            return arrCard;
        }

    }


