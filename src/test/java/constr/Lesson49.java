package constr;

import org.junit.jupiter.api.Test;

public class Lesson49 {
    @Test
    void test() {
        System.out.println(normalizeUrl("google.com"));
        System.out.println(normalizeUrl("https://ai.fi"));

    }
    public String normalizeUrl(String site) {
        if (site.startsWith("https://")) {
            return site;
        }

        return "https://" + site;
    }
}
