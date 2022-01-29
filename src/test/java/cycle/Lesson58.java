package cycle;

import org.junit.jupiter.api.Test;

public class Lesson58 {
    @Test
    void test() {
        System.out.println(reverse("Hexlet"));
    }
    public String reverse(String str) {
        var i = str.length() - 1;
        var result = "";
        while (i >= 0) {
            result = result + str.charAt(i);
            i = i - 1;
        }

        return result;
    }
}
