package LearnEnglish;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            File file = new File("src/LearnEnglish/EnglishWords/JuniorEnglishWords.properties");
            // 使用 try-with-resources 自动关闭 InputStreamReader 和 FileInputStream
            try (InputStreamReader isr = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8)) {
                properties.load(isr);
                // 遍历属性并打印
                for (String key : properties.stringPropertyNames()) {
                    String value = properties.getProperty(key);
                    System.out.println(key + " = " + value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // 打印异常信息
        }
    }
}