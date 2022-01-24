package constr;

import org.junit.jupiter.api.Test;

public class Lesson48 {
    @Test
    void test() {
        System.out.println(getSentenceTone("Hello"));
        System.out.println(getSentenceTone("WOW"));
        }
    public String getSentenceTone(String sentence) {
        if (sentence.toUpperCase().equals(sentence)) {
            return "scream";
        }

        return "normal";
    }
}
