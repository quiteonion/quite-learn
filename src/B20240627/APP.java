package B20240627;

import java.io.File;
import java.util.List;
import java.util.Properties;

public class APP {
    static Properties properties = new Properties();
    static String HTML;
    public static void main(String[] args) {
        setProperties();
        getHtml();

        Parser parser = getParser(properties.getProperty("parser"));
        List<String> parsed = parser.parser(HTML);
        System.out.println(parsed);
    }

    private static Parser getParser(String parser) {
        Parser pa = null;
        switch (parser){
            case "xmfish":
                pa =  new XMFish();
                break;/*
            case "BaiDu":
                pa = new BaiDu();
                break;*/

        }
        return pa;
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
        properties.setProperty("url","http://bbs.xmfish.com/thread-htm-fid-55-page-1.html");
    }
}
