package B20240627;

import java.io.File;
import java.util.Properties;

public class APP {
    static Properties properties = new Properties();
    static String HTML;
    public static void main(String[] args) {
        setProperties();
        getHtml();


    }

    private static void getHtml() {
        Downloader downloader = getDowloader(properties.getProperty("downloader"));
        HTML = downloader.downloader(properties.getProperty("url"));
    }

    private static Downloader getDowloader(String downloader) {
        Downloader dl = null;
        if ("Jsoup".equals(downloader)){
            dl =  new JsoupDownloader();
        } else if ("IO".equals(downloader)) {
            dl =  new IoDownloader();
        }
        return dl;
    }
    private static void setProperties(){
        properties.setProperty("downloader","Jsoup");
        properties.setProperty("parser","xmfish");
        properties.setProperty("repository","console");
        properties.setProperty("notificator","email");
        properties.setProperty("url","https://www.baidu.com");
    }
}
