package logics;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class Lesson47 {
    @Test
    void test() {
        System.out.println(notToday("2012-11-25"));
        System.out.println(notToday("2022-01-24"));
        System.out.println(notToday("2013-09-01"));

    }

    public boolean notToday(String dateAsString) {
        var date = LocalDate.now();
        return !dateAsString.equals(date.toString());
    }
}
