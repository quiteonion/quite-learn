package B20240627;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class APP {
    static Properties properties = new Properties();
    static String HTML;
    static List<URLContent> parsed;
    public static void main(String[] args) throws IOException {
        setProperties();
        getHtml();
        Parser parser = getParser(properties.getProperty("parser"));
        parsed = parser.parser(HTML);


        System.out.println("请输入搜索的关键词：");
        String keyword = new Scanner(System.in).next();
        getAbout(keyword);
    }

    private static void getAbout(String keyword) {
        for (int i = 0; i < parsed.size(); i++) {
            URLContent par = parsed.get(i);
            if (par instanceof XMFishAbout xmFishAbout){
                if (xmFishAbout.getContent().indexOf(keyword)>0) {
                    System.out.println(xmFishAbout.toString());
                }
            }
        }
    }

    private static Parser getParser(String parser) {
        Parser pa = null;
        switch (parser) {
            case "xmfish":
                pa = new XMFish();
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
        if ("Jsoup".equals(downloader)) {
            dl = new JsoupDownloader();
        } else if ("IO".equals(downloader)) {
            dl = new IoDownloader();
        }
        return dl;
    }

    private static void setProperties() throws IOException {
        File file = new File("src/B20240627/confile.properties");
        properties.load(new FileInputStream(file));
    }
}
