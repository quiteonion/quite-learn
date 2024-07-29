package B20240729;

public class APP {
    public static void main(String[] args) {
        String url = "http://bbs.xmfish.com/thread-htm-fid-55-page-1.html";
        //下载
        Downloader downloader = new XMFishDownloader();
        String html = downloader.downloader(url);
        //解析

        //存入

        //输出
    }
}
