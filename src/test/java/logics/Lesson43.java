package logics;

import org.junit.jupiter.api.Test;

public class Lesson43 {
    @Test
    void test() {
        System.out.println(isPensioner(75));
        System.out.println(isPensioner(18));

    }

    public boolean isPensioner(int age) {
        return age >= 60;
    }
}
