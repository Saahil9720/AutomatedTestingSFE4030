import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {
    private Main main = new Main();

    @Test
    public void testValidRomanNumerals() {
        assertEquals(3, main.romanToInt("III"));
        assertEquals(9, main.romanToInt("IX"));
        assertEquals(12, main.romanToInt("XII"));
        assertEquals(24, main.romanToInt("XXIV"));
        assertEquals(45, main.romanToInt("XLV"));
        assertEquals(123, main.romanToInt("CXXIII"));

        assertEquals(999, main.romanToInt("CMXCIX"));
        assertEquals(1994, main.romanToInt("MCMXCIV"));
    }

    @Test
    public void testEdgeCases() {
        assertEquals(1, main.romanToInt("I"));
        assertEquals(5, main.romanToInt("V"));
        assertEquals(10, main.romanToInt("X"));
        assertEquals(50, main.romanToInt("L"));
        assertEquals(100, main.romanToInt("C"));
        assertEquals(500, main.romanToInt("D"));
        assertEquals(1000, main.romanToInt("M"));
    }

    @Test
    public void testSubtractionCases() {
        assertEquals(4, main.romanToInt("IV"));
        assertEquals(9, main.romanToInt("IX"));
        assertEquals(40, main.romanToInt("XL"));
        assertEquals(90, main.romanToInt("XC"));
        assertEquals(400, main.romanToInt("CD"));
        assertEquals(900, main.romanToInt("CM"));
    }

    @Test
    public void testInvalidInputs() {
        assertEquals(0, main.romanToInt(""));
        assertEquals(0, main.romanToInt("ABC"));
        assertEquals(0, main.romanToInt("IIX"));
    }
}
