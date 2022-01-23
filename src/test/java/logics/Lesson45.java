package logics;

import org.junit.jupiter.api.Test;

public class Lesson45 {
    @Test
    void test() {
        System.out.println(isInternationalPhone("89602223423"));
        System.out.println(isInternationalPhone("+79602223423"));
    }

    public boolean isInternationalPhone(String phone) {
        return phone.charAt(0) == '+';
    }
}
