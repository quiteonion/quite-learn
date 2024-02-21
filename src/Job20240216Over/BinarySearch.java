package Job20240216Over;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //二分法查找数组中的数字
        //必须是在顺序数组中才能使用

        //所谓二分法就是 “切一半” 、 把数字应该存在的部分切下来，然后对比寻找
        //那么就会有三把刀
        int zuo = 0;
        int you = arr.length;
        int zhong = arr.length/2;
        //三把刀悬着，等到判断出来是要哪个部分之后就切掉不需要的那一半

        //那么就需要循环，直到找到要的部分为止
        //循环两类for 和 while 我们不清楚什么时候会找到他，但是我们先出发，使用while（true）{我们不知道结束条件是什么}
        while(true){
            //在循环中就是循环我们要的“切蛋糕”环节了
        }
    }
}
