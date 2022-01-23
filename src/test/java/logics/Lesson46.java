package logics;

import org.junit.jupiter.api.Test;

public class Lesson46 {
    @Test
    void test() {
        System.out.println(isLeapYear(2018));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2016));

    }

    public boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
