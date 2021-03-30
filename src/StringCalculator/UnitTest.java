package StringCalculator;

import static StringCalculator.StringCalculatorClass.*;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class UnitTest {

    @Test
    public void testZero() {
        assertEquals(0, add(""));
    }

    @Test
    public void testOneNumber() {
        assertEquals(5, add("5"));
    }

    @Test
    public void testManyNumbers() {

        assertEquals(6, add("1,\n2,3"));
    }
}
