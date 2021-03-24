package converter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.*;

public class UnitTest {
    Converter c = new Converter("-32768");

    @Test
    public void testMinValue() throws StringNotValidException {
        assertEquals(Integer.parseInt("-32768"), c.converterString());
    }

    @Test
    public void testMaxValue() throws StringNotValidException {
        c.setString("32767");
        assertEquals(Integer.parseInt("32767"), c.converterString());
    }

    @Test
    public void testSpaceNumber() {
        try {
            c.setString("A 3");
            c.converterString();
            fail("Test failed");
        } catch (StringNotValidException e) {
            // TODO: handle exception
            System.out.println("Error! String contains a space");
        }
    }

    @Test
    public void testPointNumber() {
        try {
            c.setString("2.2");
            c.converterString();
            fail("Test failed");
        } catch (StringNotValidException e) {
            // TODO: handle exception
            System.out.println("Error! String contains a point");
        }
    }

    @Test
    public void testCommaNumber() {
        try {
            c.setString("2,2");
            c.converterString();
            fail("Test failed");
        } catch (StringNotValidException e) {
            // TODO: handle exception
            System.out.println("Error! String contains a comma");
        }
    }
}
