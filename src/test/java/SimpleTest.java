import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//это комментарий
public class SimpleTest {

    @Test
    void test1() {
        final int x = 4 + 6;
        assertEquals(10, x, "invalid value");
    }

    @Test
    void test2() {
        final String buf = "abcd";
        assertEquals("test", buf, "invalid value");
    }

    @Test
    void test3() {

    }
}

