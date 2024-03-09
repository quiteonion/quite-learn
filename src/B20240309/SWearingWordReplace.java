package B20240309;

import java.util.Scanner;

public class SWearingWordReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("测试：请输入含有敏感词的词汇");
        String swearing = sc.next();
        //构建铭感词词库
        String[] arr = {"fuck" , "NM" ,"TMD","CNM","NMLGB","SB","ZZ"};
        for (int i = 0; i < arr.length; i++) {
            String xingxing = "";
            for (int j = 0; j < arr[i].length(); j++) {
               xingxing = "*"+xingxing;
            }
            swearing = swearing.replace(arr[i],xingxing);

        }
        System.out.println(swearing);
    }
}
