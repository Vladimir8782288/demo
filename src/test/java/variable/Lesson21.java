package variable;

import org.junit.jupiter.api.Test;

public class Lesson21 {

    @Test
    void test() {
        var info = "We couldn't verify you mother's maiden name.";
        var intro = "Here is important information about your account security.";

        var firstName = "Joffrey";
        var greeting = "Hello";

        // BEGIN (write your solution here)
        System.out.println(greeting + ", " + firstName + "!");
        System.out.println(intro + "\n" + info);
        // END
    }
}
