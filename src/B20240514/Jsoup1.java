package B20240514;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;

public class Jsoup1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Document doc = org.jsoup.Jsoup.connect("https://www.gewara.com/list/1").get();
        Elements sub = doc.getElementsByClass("list-item-name");
        //搜索框
        Elements SS = doc.getElementsByClass("header-search");
        //运行鼠标单击事件
        SS.val();

        System.out.println("你要查找的演员是？");
        String name = sc.nextLine();
        boolean flag = true;
        for (int i = 0; i < sub.size(); i++) {
            String num = sub.get(i).text();
            if (num.contains(name)) {
                System.out.println(sub.get(i));
                flag = false;
            }
        }
        if (flag) {
            System.out.println("抱歉，在第一页没有找到您想要的商品");
        }
    }
}