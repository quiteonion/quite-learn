package B20240627.XMFish.XMFishIO;

import B20240627.Downloader;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class IoDownloader extends Downloader {
    @Override
    protected String downloader(String key) throws IOException {
        String html = null;
        URL url = new URL(key); // 创建URL对象
        HttpURLConnection connection = (HttpURLConnection) url.openConnection(); // 打开连接

        // 设置请求方法（GET是默认值，但明确设置有助于代码的可读性）
        connection.setRequestMethod("GET");

        // 读取响应（假设HTTP响应状态码为200）
        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder(); // 使用StringBuilder以提高性能

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
                response.append('\n'); // 如果需要，可以在每行末尾添加换行符
            }
            in.close();

            // 返回完整的HTML源码作为字符串
            return response.toString();
        } else {
            // 处理非200的响应代码，例如打印错误信息
            throw new IOException("HTTP error code : " + responseCode);
        }
    }
}
