package B20240603;

import java.util.Random;

public class MathRandom {
    public static void main(String[] args) {
        /**
         * random
         * new Random() ： 不是，哥们？
         * random ： 嘻嘻
         * (random 固定是随机 0 ~ 1 , 另外，random 默认返回 double)
         */
        System.out.println("Math.random:");
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random()*100+1);
        }
        System.out.println("--- --- ---");
        System.out.println("new Random():");
        for (int i = 0; i < 10; i++) {
            System.out.println(new Random().nextInt(100)+1);
        }
    }
}
