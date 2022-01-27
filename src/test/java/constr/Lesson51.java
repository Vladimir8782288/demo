package constr;

import org.junit.jupiter.api.Test;
import org.apache.commons.lang3.StringUtils;

public class Lesson51 {
    @Test
    void test() {
        System.out.println(convertString("Hello"));
        System.out.println(convertString("hello"));
    }

    public String convertString(String str) {
        return Character.isUpperCase(str.charAt(0)) ? str : StringUtils.reverse(str);
    }
}
