package B20240627.XMFish.XMFishJsoup;

import B20240627.Downloader;
import org.jsoup.Jsoup;

import java.io.IOException;

public class JsoupDownloader extends Downloader {
    @Override
    protected String downloader(String key) {
        String html = null;
        try {
            html = Jsoup.connect(key).get().html();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return html;
    }
}
