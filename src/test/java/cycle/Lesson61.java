package cycle;

import org.junit.jupiter.api.Test;

public class Lesson61 {
    @Test
    void test() {
        System.out.println(hasChar("Renly", 'R'));
        System.out.println(hasChar("Renly", 'r'));
        System.out.println(hasChar("Tommy", 'm'));
        System.out.println(hasChar("Tommy", 'd'));

    }
    public boolean hasChar(String str, char ch) {
        var i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == ch) {
                return true;
            }

            i += 1;
        }

        return false;
    }
}
