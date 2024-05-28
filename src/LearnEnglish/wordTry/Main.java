package LearnEnglish.wordTry;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws Exception {
        String jsonString = "{\"word\":\"ability\",\"translations\":[{\"translation\":\"能力，能耐；才能\",\"type\":\"n\"}],\"phrases\":[/* ... 省略其他phrase数据 ... */]}";

        ObjectMapper mapper = new ObjectMapper();
        Word word = mapper.readValue(jsonString, Word.class);

        // 现在你可以使用word对象了
        System.out.println("Word: " + word.getWord());
        for (Word.Translation translation : word.getTranslations()) {
            System.out.println("Translation: " + translation.getTranslation() + ", Type: " + translation.getType());
        }
        for (Word.Phrase phrase : word.getPhrases()) {
            System.out.println("Phrase: " + phrase.getPhrase() + ", Translation: " + phrase.getTranslation());
        }
    }
}