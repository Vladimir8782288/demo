package perem;

import org.junit.jupiter.api.Test;

public class Lesson20 {
    @Test
    void test() {
        var eurosCount = 100;

        // BEGIN (write your solution here)
        var dollarsCount = eurosCount * 1.25;
        var rublesCount = dollarsCount * 60;
        System.out.println(dollarsCount);
        System.out.println(rublesCount);
        // END
    }
}
