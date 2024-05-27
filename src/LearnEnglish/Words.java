package LearnEnglish;

public class Words {
    private String phrase;
    private String translation;

    public Words() {
    }

    public String getphrase() {
        return phrase;
    }

    public void setphrase(String phrase) {
        this.phrase = phrase;
    }

    public String gettranslation() {
        return translation;
    }

    public void settranslation(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "Words{" +
                "phrase='" + phrase + '\'' +
                ", translation='" + translation + '\'' +
                '}';
    }
}
