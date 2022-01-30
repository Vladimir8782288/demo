package cycle;

import org.junit.jupiter.api.Test;

public class Lesson62 {
    @Test
    void test() {
        System.out.println(encrypt("move"));
        System.out.println(encrypt("attack"));
        System.out.println(encrypt("go!"));
    }
    public String encrypt(String str) {
        var result = "";
        for (var i = 0; i < str.length(); i += 2) {
            var nextSymbol = (i + 2 > str.length()) ? "" : str.substring(i + 1, i + 2);
            result = result + nextSymbol + str.charAt(i);
        }

        return result;
    }
}
