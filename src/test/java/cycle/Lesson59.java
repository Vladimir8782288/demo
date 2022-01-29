package cycle;

import org.junit.jupiter.api.Test;

public class Lesson59 {
    @Test
    void test() {
        var str = "If I look back I am lost";
        System.out.println(filterString(str, 'I'));
        System.out.println(filterString(str, 'o'));
    }
    public String filterString(String str, char ch) {
        var i = 0;
        var result = "";
        while (i < str.length()) {
            var currentChar = str.charAt(i);
            if (currentChar != ch) {
                result = result + currentChar;
            }
            i += 1;
        }

        return result;
    }
}
