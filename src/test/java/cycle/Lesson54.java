package cycle;

import org.junit.jupiter.api.Test;

public class Lesson54 {
    @Test
    void test() {
       System.out.println(multiplyNumbersFromRange(1, 5));
       System.out.println(multiplyNumbersFromRange(2, 3));
       System.out.println(multiplyNumbersFromRange(6, 6));
          }

    public int multiplyNumbersFromRange(int start, int finish) {
        var i = start;
        var result = 1;

        while (i <= finish) {
            result = result * i;
            i = i + 1;
        }

        return result;
    }
}
