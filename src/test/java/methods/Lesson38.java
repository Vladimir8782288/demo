package methods;

import org.junit.jupiter.api.Test;

public class Lesson38 {
    @Test
    void test()  {
        var emoji = "-(";
        // BEGIN
        var happyEmoji = ":" + emoji.replace('(', ')');
        System.out.println(happyEmoji);
        // END
    }
}
