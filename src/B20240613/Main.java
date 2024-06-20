package B20240613;

import java.io.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        //ArrayList 读取的人物元素加入
        properties.put("1","2");
        String fileName = "src/B20240613/Bank/user.properties";

        try (OutputStream output = new FileOutputStream(fileName)) {
            // 使用store方法将Properties对象写入到文件中
            // 第二个参数表示注释，通常用于描述这个properties文件的作用
            properties.store(output, "新注册用户");
            // 输出到控制台以确认写入成功
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        File file = new File(fileName);
        properties.load(new FileInputStream(file));
        System.out.println(properties.get("1"));

        System.out.println(properties);
    }
}