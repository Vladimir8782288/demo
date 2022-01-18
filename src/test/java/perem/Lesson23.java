package perem;

import org.junit.jupiter.api.Test;

public class Lesson23 {
    @Test
    void test() {
        var king = "King Balon the 6th";
        // BEGIN (write your solution here)
        var numberCastles = 6;
        var roomsCastle = 17;
        System.out.println(king + " has " + (numberCastles * roomsCastle) + " rooms.");
        // END
    }
}
