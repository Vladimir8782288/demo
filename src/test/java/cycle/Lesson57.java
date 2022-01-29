package cycle;

import org.junit.jupiter.api.Test;

public class Lesson57 {
    @Test
    void test() {
        System.out.println(countChars("HexlEt", 'e'));
        System.out.println(countChars("HexlEt", 'E'));
    }

    public int countChars(String str, char ch) {
        var i = 0;
        var count = 0;
        while (i < str.length()) {
            var currentChar = Character.toLowerCase(str.charAt(i));
            if (currentChar == Character.toLowerCase(ch)) {
                count = count + 1;
            }
            i = i + 1;
        }

        return count;
    }
}
