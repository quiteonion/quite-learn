package B20240627;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;

public class XMFish implements Parser {

    @Override
    public List<String> getParser(String html) {
        Document doc = Jsoup.parse(html);
        Elements el = doc.getElementsByClass("");
        htmlList.add(el.html());
        //解析
        return htmlList;
    }
}
