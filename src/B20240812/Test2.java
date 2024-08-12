package B20240812;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] boys = {"小明","小红","小刚","小智","小梦","小如","小林","小王","小张"};
        String[] girls = {"小七","小米","小鸡","小康","小呆","小帅","小妹","小小","大咯"};
        int[] num = {0,0,0,0,0,0,0,1,1,1};
        int i = random.nextInt(boys.length);
        int j = random.nextInt(num.length);
        if (num[j] == 1){
            System.out.println(girls[i]);
        }else {
            System.out.println(boys[i]);
        }


    }
}
