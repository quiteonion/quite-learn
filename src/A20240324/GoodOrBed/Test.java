package A20240324.GoodOrBed;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Leadership l = new Leadership();
        Scanner sc = new Scanner(System.in);
        System.out.println("您能评价一下我的哥哥吗？你觉得他是好还是不好啊？");
        String h = sc.next();
        l.setGB(h);
        while (true){
            System.out.println("你最好再说一遍！");
            String d = sc.next();
            if (d.equals("好")){
                l.PJ(l);
                break;
            }
        }
    }
}
