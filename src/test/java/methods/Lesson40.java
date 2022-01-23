package methods;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class Lesson40 {
    @Test
    void test() {
        System.out.println(getCurrentYear());
    }

    public int getCurrentYear() {
        var date = LocalDate.now();
        return Integer.parseInt(date.toString().substring(0, 4));
    }
}
