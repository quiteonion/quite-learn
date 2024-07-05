package B20240627.XMFishJsoup;


import B20240627.URLContent;

public class XMFishAbout extends URLContent {

    private String quality;
    private String content;
    private String url;
    private String time;

    public XMFishAbout(String quality, String content, String url, String time) {
        this.quality = quality;
        this.content = content;
        this.url = url;
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "性质  " + quality + '\n' +
                "标题  " + content + '\n' +
                "链接  " + url + '\n' +
                "发布时间  " + time + '\n';
    }
}
