package B20240627;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class XMFishAbout extends URLContent {
    private String quality;
    private String content;
    private String from;
    private String seller;
    private String time;

    public XMFishAbout(String quality, String content, String from, String seller, String time) {
        this.quality = quality;
        this.content = content;
        this.from = from;
        this.seller = seller;
        this.time = time;
    }
    public LocalDate getDate(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate localDate = LocalDate.now();
        return localDate;
    }
}
