package cycle;

import org.junit.jupiter.api.Test;

public class Lesson56 {
    @Test
    void test() {
                printReversedNameBySymbol("Arya");
    }

    public void printReversedNameBySymbol(String name) {
        var i = name.length() - 1;
        while (i >= 0) {
            System.out.println(name.charAt(i));
            i = i - 1;
        }
    }
}