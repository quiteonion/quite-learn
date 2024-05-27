package LearnEnglish;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Main {
    public static void main(String[] args) throws Exception {
// ...
        String jsonString = "{\"phrase\":\"John Doe\",\"translation\":30}";

        ObjectMapper mapper = new ObjectMapper();
        try {
            Words words = mapper.readValue(jsonString, Words.class);
            System.out.println("phrase: " + words.getphrase());
            System.out.println("translation: " + words.gettranslation());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}