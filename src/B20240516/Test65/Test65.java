package B20240516.Test65;


import java.util.ArrayList;
import java.util.Scanner;

public class Test65 {
    public static void main(String[] args) {
        ArrayList<CE> Map = new ArrayList<>();
        Map.add(new CE("good","好的"));
        Map.add(new CE("bad","坏的"));
        Map.add(new CE("where","哪里"));
        boolean flag = false;
        System.out.println("请输入你要查找的");
        String name = new Scanner(System.in).next();
        for (int i = 0; i < Map.size(); i++) {
            if (name.equals(Map.get(i).getEnglish())){
                System.out.println(Map.get(i).getChinese());
                flag = true;
            }
        }
        if (flag){
            System.out.println("找不到");
        }
    }
}
