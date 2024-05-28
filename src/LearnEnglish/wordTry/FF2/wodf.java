package LearnEnglish.wordTry.FF2;


import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class wodf {
    public static void main(String[] args) {
        String jsonFile = "D:\\idea\\idea 存储\\quite\\src\\LearnEnglish\\wordTry\\1word.json"; // 假设这是你的JSON文件路径

        try (BufferedReader reader = new BufferedReader(new FileReader(jsonFile))) {
            StringBuilder out = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                out.append(line);
            }
            String jsonString = out.toString();

            // 解析整个字符串为JSONArray（这里实际上应该是一个JSONObject数组，但格式上是JSONArray）
            JSONArray jsonArray = new JSONArray(jsonString);

            // 遍历JSONArray中的每个JSONObject（每个JSONObject代表一个单词）
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject wordObj = jsonArray.getJSONObject(i);

                // 获取单词
                String word = wordObj.getString("word");

                // 获取翻译列表
                JSONArray translations = wordObj.getJSONArray("translations");
                for (int j = 0; j < translations.length(); j++) {
                    JSONObject translationObj = translations.getJSONObject(j);
                    String translation = translationObj.getString("translation");
                    String type = translationObj.optString("type", "N/A"); // 使用optString处理type可能不存在的情况
                    System.out.println("Word: " + word + ", Translation: " + translation + ", Type: " + type);
                }

                // 获取短语列表（如果需要）
                JSONArray phrases = wordObj.getJSONArray("phrases");
                for (int k = 0; k < phrases.length(); k++) {
                    JSONObject phraseObj = phrases.getJSONObject(k);
                    String phrase = phraseObj.getString("phrase");
                    String phraseTranslation = phraseObj.getString("translation");
                    System.out.println("Phrase: " + phrase + ", Translation: " + phraseTranslation);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.JSONException e) {
            e.printStackTrace();
            // 处理JSON解析异常
        }
    }
}