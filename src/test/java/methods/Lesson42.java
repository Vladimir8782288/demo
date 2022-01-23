package methods;

import org.junit.jupiter.api.Test;


public class Lesson42 {
    @Test
    void test() {
        System.out.println(getHiddenCard("2034399002125581"));
        System.out.println(getHiddenCard("2034399002125581",10));
    }

    public String getHiddenCard(String cardNumber, int starsCount) {
        var visibleDigitsLine = cardNumber.substring(12);
        return "*".repeat(starsCount) + visibleDigitsLine;
    }

    public String getHiddenCard(String cardNumber) {
        return getHiddenCard(cardNumber, 4);
    }
}
