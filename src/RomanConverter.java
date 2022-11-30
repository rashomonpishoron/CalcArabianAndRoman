import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RomanConverter {

    private Map <Integer, String> romanHashMap = Map.of(1, "I", 2,"II", 3, "III", 4, "IV", 5, "V", 6, "VI", 7, "VII", 8, "VIII", 9, "IX", 10, "X");

    private static Map <Integer, String> romanHashMapAnswer = new HashMap();

    static {
        romanHashMapAnswer.put(1, "I");
        romanHashMapAnswer.put(2, "II");
        romanHashMapAnswer.put(3, "III");
        romanHashMapAnswer.put(4, "IV");
        romanHashMapAnswer.put(5, "V");
        romanHashMapAnswer.put(6, "VI");
        romanHashMapAnswer.put(7, "VII");
        romanHashMapAnswer.put(8, "VIII");
        romanHashMapAnswer.put(9, "IX");
        romanHashMapAnswer.put(10, "X");
        romanHashMapAnswer.put(11, "XI");
        romanHashMapAnswer.put(12, "XII");
        romanHashMapAnswer.put(13, "XIII");
        romanHashMapAnswer.put(14, "XIV");
        romanHashMapAnswer.put(15, "XV");
        romanHashMapAnswer.put(16, "XVI");
        romanHashMapAnswer.put(17, "XVII");
        romanHashMapAnswer.put(18, "XVIII");
        romanHashMapAnswer.put(19, "XIX");
        romanHashMapAnswer.put(20, "XX");
    }


}
