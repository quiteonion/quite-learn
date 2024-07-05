package B20240627;

import B20240627.Email.AllEmail;
import B20240627.XMFish.XMFishIO.IoDownloader;
import B20240627.XMFish.XMFishJsoup.JsoupDownloader;
import B20240627.XMFish.XMFish;
import B20240627.XMFish.XMFishAbout;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class APP {

    static Properties properties = new Properties();
    static String HTML;
    static List<URLContent> parsed;
    static ArrayList<String> sb = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        setProperties();
        getHtml();
        Parser parser = getParser(properties.getProperty("parser"));
        parsed = parser.parser(HTML);
        System.out.println("请输入搜索的关键词：");
        String keyword = new Scanner(System.in).next();
        getAbout(keyword);
        manner();
    }

    private static void manner() throws Exception {
        switch (properties.getProperty("notificator")) {
            case "email":
                setEmail();
                break;
            case "console":
                System.out.println(sb.toString());
                break;

        }
    }

    private static void setEmail() throws Exception {
        AllEmail.send("3345973813@qq.com", sb.toString());
    }

    private static void getAbout(String keyword) {
        boolean flag = true;
        for (int i = 0; i < parsed.size(); i++) {
            URLContent par = parsed.get(i);
            if (par instanceof XMFishAbout xmFishAbout) {
                if (xmFishAbout.getContent().indexOf(keyword) > 0) {
                    flag = false;
                    sb.add(xmFishAbout.toString() + " ====== ");
                }
            }
        }
        if (flag) {
            System.out.println("抱歉，并没有搜索到你查找的关键词");
            System.exit(0);
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

    private static void getHtml() throws IOException {
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
