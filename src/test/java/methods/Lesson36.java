package methods;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lesson36 {

    @Test
    void test() throws IOException {
            // BEGIN (write your solution here)
            var path = Paths.get("Test.java");
            var data = (path);
            System.out.println(data);
            // END
        }
    }
