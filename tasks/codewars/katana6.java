package tasks.codewars;

import org.junit.Test;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

public class katana6 {

    public static TreeMap<Integer,String> roman = new TreeMap<>();

    public String solution(int n) {
        roman.put(1,"I");
        roman.put(4,"IV");
        roman.put(5,"V");
        roman.put(9,"IX");
        roman.put(10,"X");
        roman.put(40,"XL");
        roman.put(50,"L");
        roman.put(90,"XC");
        roman.put(100,"C");
        roman.put(400,"CD");
        roman.put(500,"D");
        roman.put(900, "CM");
        roman.put(1000,"M");


        return toRoman(n);
    }

    /**
     * floorKey - return less or equal from TreeMap
     * So, when we have '6', it's return '5', and then '6-5=1'
     */
    private static final String toRoman(int number){
        int l = roman.floorKey(number);
        if (number == l) {
            return roman.get(number);
        }
        return roman.get(l) + toRoman(number - l);
    }



    @Test
    public void shouldConvertToRoman() {
        katana6 conversion = new katana6();
        assertEquals("solution(1) should equal to I", "I", conversion.solution(1));
        assertEquals("solution(4) should equal to IV", "IV", conversion.solution(4));
        assertEquals("solution(2000) should equal to MM", "MM", conversion.solution(2000));
    }
}
