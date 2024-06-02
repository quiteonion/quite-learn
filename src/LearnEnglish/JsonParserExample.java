package LearnEnglish;


import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JsonParserExample {
    public static void main(String[] args) {
        String JuniorEnglishFile = "src/LearnEnglish/EnglishWords/JuniorEnglish.json"; // 假设这是你的JSON文件路径

        try (BufferedReader reader = new BufferedReader(new FileReader(JuniorEnglishFile))) {
            StringBuilder out = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                out.append(line);
            }
            String JuniorEnglishString = out.toString();

            // 解析整个字符串为JSONArray
            JSONArray JuniorEnglishArray = new JSONArray(JuniorEnglishString);

            // 遍历JSONArray中的每个JSONObject
            for (int i = 0; i < JuniorEnglishArray.length(); i++) {
                JSONObject wordData = JuniorEnglishArray.getJSONObject(i);
                String word = wordData.getString("word");
                String translation = wordData.getString("translation");
                System.out.println("Word: " + word + ", Translation: " + translation);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.JSONException e) {
            e.printStackTrace();
            // 处理JSON解析异常
        }
    }
}