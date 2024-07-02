package B20240627;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class XMFish implements Parser {
    static String quality;
    static String content;
    static String from;
    static String seller;
    static String time;

    static ArrayList<URLContent> url = new ArrayList<>();
    @Override
    public List<URLContent> parser(String html) {
        parse(html);
        XMFishAbout xmFishAbout = new XMFishAbout(quality, content, from, seller, time);
        url.add(xmFishAbout);
        return url;
    }

    private void parse(String html) {
        //解析
        Document doc = Jsoup.parse(html);
        //性质：闲置转让或无偿赠与
        Elements quality = doc.getElementsByClass("view").select("a");
        //内容：关于该商品的内容
        Elements subjectT = doc.getElementsByClass("subject_t");

        for (int i = 0; i < subjectT.size(); i++) {
            System.out.println(subjectT.get(i));
        }
        //tr3
        //s4 : 商品状态 上一层 subject
        //subject_t ： 商品简介
        //s6 ： 客户端来自
        //author 下含有 a 标题 和 p 标题的 为卖家信息和挂售时间 以及最后回复人和回复时间

        /**
         *
         * 内容：关于该商品的内容
         * 来自：关于卖家使用哪一个客户端进行发起的交易
         * 卖家：卖家的名称
         * 时间：关于该商品被挂上交易平台的时间
         *
         */
    }
}
