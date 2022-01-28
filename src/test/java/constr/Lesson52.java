package constr;

import org.junit.jupiter.api.Test;

public class Lesson52 {
    @Test
    void test() {
        System.out.println(getNumberExplanation(1000));
        System.out.println(getNumberExplanation(42));
        System.out.println(getNumberExplanation(7));
    }
    public String getNumberExplanation(int number) {
        switch (number) {
            case 666:
                return "devil number";
            case 7:
                return "prime number";
            case 42:
                return "answer for everything";
            default:
                return null;
        }
    }
}
