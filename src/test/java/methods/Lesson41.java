package methods;

import org.junit.jupiter.api.Test;

public class Lesson41 {
    @Test
    void test() {
        System.out.println(truncate("Три закона робототехники придумали кожаные мешки, но мы их перехитрим",48));
    }

    public String truncate(String text, int length) {
        return text.substring(0, length) + "...";
    }
}
