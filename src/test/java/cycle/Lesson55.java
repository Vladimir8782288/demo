package cycle;

import org.junit.jupiter.api.Test;

public class Lesson55 {
    @Test
    void test() {
        System.out.println(joinNumbersFromRange(1, 1));
        System.out.println(joinNumbersFromRange(2, 3));
        System.out.println(joinNumbersFromRange(5, 10));
    }

    public String joinNumbersFromRange(int start, int finish) {
        var i = start;
        var result = "";

        while (i <= finish) {
            result = result + i;
            i = i + 1;
        }

        return result;
    }
}
