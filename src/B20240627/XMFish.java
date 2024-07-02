package B20240627;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.ArrayList;
import java.util.List;

public class XMFish implements Parser {

    @Override
    public List<URLContent> parser(String html) {
        ArrayList<URLContent> url = new ArrayList<>();
        Document doc = Jsoup.parse(html);
        String title = doc.title();
//        htmlList.add("网页标题：" + title);
        //tr3
        //s4 : 商品状态
        //subject_t ： 商品简介
        //s6 ： 客户端来自
        //author 下含有 a 标题 和 p 标题的 为卖家信息和挂售时间 以及最后回复人和回复时间
        //num ： 回复数


        /**
         *
         * 性质：闲置转让或无偿赠与
         * 内容：关于该商品的内容
         * 来自：关于卖家使用哪一个客户端进行发起的交易
         * 卖家：卖家的名称
         * 时间：关于该商品被挂上交易平台的时间
         *
         */
        doc.getElementsByClass("tr3");
        //解析
        return url;
    }
}
