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
        Parser parser = new XMFishParser();
        List<String> list = parser.parser(html);
        //存储
        Ropository ropository = new XMFishRopository();
        List<String> ls = ropository.getHtml(list);
        //输出
        Tificator tificator = new XMFishTificator();
        tificator.up(ls);
    }
}
