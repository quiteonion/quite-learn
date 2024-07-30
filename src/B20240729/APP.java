package B20240729;

import java.util.List;

public class APP {
    public static void main(String[] args) {
        String url = "http://bbs.xmfish.com/thread-htm-fid-55-page-1.html";
        //下载
        System.out.println("准备下载..." + url);
        Downloader downloader = new XMFishDownloader();
        String html = downloader.downloader(url);
        System.out.println("下载完成..." + url);
        //解析
        System.out.println("准备解析..." + url);
        Parser parser = new XMFishParser();
        List<URLContent> list = parser.parser(html);
        System.out.println("解析完成..." + url);
        //存储
        System.out.println("准备存入..." + url);
        Ropository ropository = new XMFishRopository();
        List<URLContent> ls = ropository.getHtml(list);
        System.out.println("存入完成..." + url);
        //输出
        System.out.println("准备输出..." + url);
        Tificator tificator = new XMFishTificator();
        tificator.up(ls);
        System.out.println("结束输出..." + url);
    }
}
