package B20240627.XMFish;

import B20240627.Parser;
import B20240627.URLContent;
import B20240627.XMFish.XMFishAbout;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class XMFish implements Parser {
    static ArrayList<URLContent> commodity = new ArrayList<>();

    @Override
    public List<URLContent> parser(String html) {
        parse(html);
        return commodity;
    }

    private void parse(String html) {
        Document document = Jsoup.parse(html);
        Elements es = document.select("tbody[id=threadlist]").select("tr[class=tr3]");


        // 循环遍历
        for (Element e : es) {
            // 过滤公告、置顶
            Element noticeAndTop = e.select("td.icon a i").first();
            if (noticeAndTop.hasAttr("alt") && "置顶帖标志".equals(noticeAndTop.attr("alt"))) {
                continue;
            }

            // 解析数据
            Element titleElement = e.select("td.subject a.subject_t").first();
            Elements quality = e.getElementsByClass("view").select("a");
            String tr = quality.text();
            String title = titleElement.text();
            String url = titleElement.attr("href");
            url = "http://bbs.xmfish.com/" + url;
            String createdAt = e.select("td.author").first().select("p").text();



            XMFishAbout xmFishAbout = new XMFishAbout(tr,title,url,createdAt);
            commodity.add(xmFishAbout);
        }
    }
}
