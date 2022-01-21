package methods;

import org.junit.jupiter.api.Test;

public class Lesson32 {
    @Test
    void test() {
        var text = "Never forget what you are, for surely the world will not";

        // BEGIN (write your solution here)
        var result = "First: "
                + text.charAt(0)
                + "\nLast: "
                + text.charAt(text.length() - 1);

        System.out.println(result);
        // END
    }
}
