package A20240417;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class AboutJS {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://so.gushiwen.org/gushi/shijing.aspx").get();
        System.out.println(doc.getElementsByClass("typecont").select("span").size());
        System.out.println(doc.getElementsByClass("typecont").select("span").text());

    }
}
