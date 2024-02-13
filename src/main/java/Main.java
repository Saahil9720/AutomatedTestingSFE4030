import java.util.*;

public class Main {
    private static final Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public static int romanToInt(String s) {
        // Validate input
        if (!s.matches("[IVXLCDM]+")) {
            return 0;
        }

        int convertedNumber = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentNumber = map.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0;

            if (currentNumber >= next) {
                convertedNumber += currentNumber;
            } else {
                convertedNumber -= currentNumber;
            }
        }
        return convertedNumber;
    }

    public static void main(String[] args) {
        // Example usage
        String roman = "MCMXCIV"; // 1994
        System.out.println(romanToInt(roman));
    }
}
