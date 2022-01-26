package constr;

import org.junit.jupiter.api.Test;

public class Lesson50 {
    @Test
    void test() {
        System.out.println(whoIsThisHouseToStarks("Karstark"));
        System.out.println(whoIsThisHouseToStarks("Frey"));
        System.out.println(whoIsThisHouseToStarks("Joar"));
        System.out.println(whoIsThisHouseToStarks("Ivanov"));

    }
    public String whoIsThisHouseToStarks(String houseName) {
        if ("Karstark".equals(houseName) || "Tally".equals(houseName)) {
            return "friend";
        } else if ("Lannister".equals(houseName) || "Frey".equals(houseName)) {
            return "enemy";
        }

        return "neutral";
    }
}
