package LearnEnglish.TxtToJson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TxtToJsonConverter {

    public static void main(String[] args) {
        String txtFilePath = "src/LearnEnglish/TxtToJson/m1.txt"; // 替换为你的TXT文件路径
        String jsonOutputFilePath = "src/LearnEnglish/TxtToJson/m1.json"; // 替换为你想要保存的JSON文件路径

        ArrayNode arrayNode = convertTxtToJsonArray(txtFilePath);
        writeJsonArrayToFile(arrayNode, jsonOutputFilePath);
    }

    public static ArrayNode convertTxtToJsonArray(String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        ArrayNode arrayNode = mapper.createArrayNode();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" "); // 假设单词和翻译之间用制表符分隔
                if (parts.length == 2) {
                    // ...（省略创建ObjectNode并添加到arrayNode的代码）...
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arrayNode;
    }

    public static void writeJsonArrayToFile(ArrayNode arrayNode, String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        File jsonFile = new File(filePath);
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(jsonFile, arrayNode);
            System.out.println("JSON文件已成功创建在: " + jsonFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}