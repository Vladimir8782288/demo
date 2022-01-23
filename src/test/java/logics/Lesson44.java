package logics;

import org.apache.commons.lang.StringUtils;
import org.junit.jupiter.api.Test;

public class Lesson44 {
    @Test
    void test() {
        System.out.println(isPalindrome("шалаш"));
        System.out.println(isPalindrome("ага"));
        System.out.println(isPalindrome("хекслет"));

    }

    public boolean isPalindrome(String word) {
        var normalizedWord = word.toLowerCase();
        var reversedWord = StringUtils.reverse(normalizedWord);
        return normalizedWord.equals(reversedWord);
    }
}
