package LearnEnglish.wordTry;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

// 表示一个单词及其相关信息
public class Word {
    private String word;
    private List<Translation> translations;
    private List<Phrase> phrases;

    // Getter 和 Setter 方法
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public List<Translation> getTranslations() {
        return translations;
    }

    public void setTranslations(List<Translation> translations) {
        this.translations = translations;
    }

    public List<Phrase> getPhrases() {
        return phrases;
    }

    public void setPhrases(List<Phrase> phrases) {
        this.phrases = phrases;
    }

    // 内部类：表示一个翻译
    public static class Translation {
        @JsonProperty("translation")
        private String translation;
        @JsonProperty("type")
        private String type;

        // Getter 和 Setter 方法
        // ...

        public String getTranslation() {
            return translation;
        }

        public void setTranslation(String translation) {
            this.translation = translation;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    // 内部类：表示一个短语及其翻译
    public static class Phrase {
        @JsonProperty("phrase")
        private String phrase;
        @JsonProperty("translation")
        private String translation;

        // Getter 和 Setter 方法
        // ...

        public String getPhrase() {
            return phrase;
        }

        public void setPhrase(String phrase) {
            this.phrase = phrase;
        }

        public String getTranslation() {
            return translation;
        }

        public void setTranslation(String translation) {
            this.translation = translation;
        }
    }

    // 为了简洁，这里省略了Getter和Setter方法的实现
    // 你应该为Word、Translation和Phrase类中的每个字段都添加Getter和Setter方法
}