package B20240514;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;

public class Jsoup1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Document doc = Jsoup.connect("https://www.gewara.com/list/1").get();
        Elements sub = doc.getElementsByClass("list-item-name");
        System.out.println("你要查找的演员是？");
        String name = sc.nextLine();
        //搜索框
        Element SS = doc.getElementsByClass("header-search").get(0).select("input").get(0).val(name);
        //运行鼠标单击事件
        doc.getElementsByClass("header-search").get(0).select("i").get(0).clone();

        boolean flag = true;
        for (int i = 0; i < sub.size(); i++) {
            String num = sub.get(i).text();

                System.out.println(sub.get(i));
                flag = false;

        }
        if (flag) {
            System.out.println("抱歉，在第一页没有找到您想要的商品");
        }
    }
}