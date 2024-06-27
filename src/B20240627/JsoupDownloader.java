package B20240627;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class JsoupDownloader extends Downloader{
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
