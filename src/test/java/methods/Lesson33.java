package methods;

import org.junit.jupiter.api.Test;

public class Lesson33 {
    @Test
    void test() {
        var email = " SupporT@hexlet.io\n";

        // BEGIN (write your solution here)
        email = email.trim();
        email = email.toLowerCase();
        System.out.println(email);
        // END
    }
}
