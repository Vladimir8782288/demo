package methods;

import org.junit.jupiter.api.Test;

public class Lesson30 {
    @Test
    void test() {
        var company1 = "Apple";
        var company2 = "Samsung";

        // BEGIN (write your solution here)
        var company1Length = company1.length();
        var company2Length = company2.length();

        System.out.println(company1Length + company2Length);
        // END
    }
}
