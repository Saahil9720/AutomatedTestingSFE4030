import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {
    private final Main main = new Main();

    @Test
    public void testValidRomanNumerals() {
        assertEquals(3, Main.romanToInt("III"));
        assertEquals(9, Main.romanToInt("IX"));
        assertEquals(12, Main.romanToInt("XII"));
        assertEquals(24, Main.romanToInt("XXIV"));
        assertEquals(45, Main.romanToInt("XLV"));
        assertEquals(123, Main.romanToInt("CXXIII"));

        assertEquals(999, Main.romanToInt("CMXCIX"));
        assertEquals(1994, Main.romanToInt("MCMXCIV"));
    }

    @Test
    public void testEdgeCases() {
        assertEquals(1, Main.romanToInt("I"));
        assertEquals(5, Main.romanToInt("V"));
        assertEquals(10, Main.romanToInt("X"));
        assertEquals(50, Main.romanToInt("L"));
        assertEquals(100, Main.romanToInt("C"));
        assertEquals(500, Main.romanToInt("D"));
        assertEquals(1000, Main.romanToInt("M"));
    }

    @Test
    public void testSubtractionCases() {
        assertEquals(4, Main.romanToInt("IV"));
        assertEquals(9, Main.romanToInt("IX"));
        assertEquals(40, Main.romanToInt("XL"));
        assertEquals(90, Main.romanToInt("XC"));
        assertEquals(400, Main.romanToInt("CD"));
        assertEquals(900, Main.romanToInt("CM"));
    }

    @Test
    public void testInvalidInputs() {
        assertEquals(0, Main.romanToInt(""));
        assertEquals(0, Main.romanToInt("123"));
        assertEquals(0, Main.romanToInt("XZU"));
    }
}
