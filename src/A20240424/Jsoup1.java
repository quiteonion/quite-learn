package A20240424;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;

public class Jsoup1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Document doc = org.jsoup.Jsoup.connect("http://bbs.xmfish.com/thread-htm-fid-55-page-1.html").get();
        Elements sub = doc.getElementsByClass("subject_t");
        Elements p = sub.select("p");
        System.out.println("你要查找的商品是？");
        String name = sc.nextLine();
        boolean flag = true;
        for (int i = 0; i < sub.size(); i++) {
            String num = sub.get(i).text();
            if (num.contains(name)){
                System.out.println(num);
                System.out.println(p);
                System.out.println(sub.get(i));
                flag = false;
            }
        }
        if (flag){
            System.out.println("抱歉，在第一页没有找到您想要的商品");
        }
    }
}
