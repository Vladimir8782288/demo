package cycle;

import org.junit.jupiter.api.Test;

public class Lesson53 {
    @Test
    void test() {
        System.out.println("start");
        printNumbers(4);
    }

    public void printNumbers(int firstNumber) {
        var i = firstNumber;
        while (i >= 1) {
            System.out.println(i);
            i = i - 1;
        }
        System.out.println("finished!");
    }
}
