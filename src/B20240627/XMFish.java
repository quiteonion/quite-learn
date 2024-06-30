package B20240627;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;

public class XMFish implements Parser {

    @Override
    public List<String> parser(String html) {
        Document doc = Jsoup.parse(html);
        String title = doc.title();
        htmlList.add("网页标题：" + title);
        //tr3
        //s4 : 商品状态
        //subject_t ： 商品简介
        //s6 ： 客户端来自
        //author 下含有 a 标题 和 p 标题的 为卖家信息和挂售时间 以及最后回复人和回复时间
        //num ： 回复数

        doc.getElementsByClass("tr3");
        //解析
        return htmlList;
    }
}
