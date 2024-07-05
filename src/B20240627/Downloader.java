package B20240627;

import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.MalformedURLException;

public abstract class Downloader {
    protected abstract String downloader(String key) throws IOException;

}
