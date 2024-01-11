package Day006;

import java.io.IOException;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //打字游戏
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("是否开始游戏？( 1 是 )");
        int yesno = sc.nextInt();
        //系统自动判定新增文字
        if (1 == yesno) {
            while (true) {
                System.out.println("按 回车 开始游戏");
                String lkj = sc.next();
                game();
                System.out.println();
                System.out.println("按  1  重新游戏");
                int mun = sc.nextInt();
                if (mun == 1){
                    continue;
            }else {
                    return;
                }
            }
        }else{
            return;
        }
    }


    public static void game(){
        Calendar calendar = Calendar.getInstance();
        //获取时间的类
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        /**/
        int time2 = calendar.get(Calendar.SECOND); // 获取当前秒
        String[] arr = new String[51];
        //数组用来存放51个英文字母
        //随机使用小写字母填充
        //随机加上 31 达到随机随机字母的能力
        int count = 0;
        /**/
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(25);
            arr[i] = String.valueOf((char)('a' + number));
        }
        /**/
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        /**/
        for (int i = 0; i < arr.length; i++) {
            //循环中输入你的答案
            String join =  sc.next();
            /**/
            if (arr[i].equals(join))
            {
                System.out.print(join);
                count++;
            }else {
                System.out.print("_");
            }
        }
        System.out.println();
        System.out.println("游戏结束");
        System.out.println("本次输入正确" + count + "个字母");
        System.out.println("正确率" + (double)count/50.0);
        int time1 = calendar.get(Calendar.SECOND); // 获取当前秒
        System.out.println("共使用"+ (time1 - time2) + "秒");

    }
}
