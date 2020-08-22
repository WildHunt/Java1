package tasks.codewars;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import java.util.Map;


/**
 * The goal of this exercise is to convert a string to a new string where each character in the new string is "("
 * if that character appears only once in the original string, or ")" if that character appears more than once in the
 * original string. Ignore capitalization when determining if a character is a duplicate.
 */

/**
 * Example
 * "din"      =>  "((("
 * "recede"   =>  "()()()"
 * "Success"  =>  ")())())"
 * "(( @"     =>  "))(("
 */


public class katana7 {
    /**
     * My solution
     */
    static String encode(String word){
        StringBuilder output = new StringBuilder();
        Map<Character,Integer> charMap = new HashMap<>();
        word = word.toLowerCase();
        char[] charArray = word.toCharArray();
        int temp=0;
        for (int i=0;i<charArray.length;i++){
            if(charMap.containsKey(charArray[i])){
                temp = charMap.get(charArray[i]);
                charMap.replace(charArray[i],++temp);
            }
            else
                charMap.put(charArray[i],1);
        }

        for(int i=0;i<word.length();i++){
            if(charMap.get(charArray[i])>=2)
                output.append(')');
            else
                output.append('(');
        }
        return output.toString();
    }

    /**
     * Best solution with lastIndexOf
     */
    static String encode1(String word){
        String lowerWord = word.toLowerCase();
        StringBuilder result = new StringBuilder();
        for(char ch: lowerWord.toCharArray()) {
            boolean single = lowerWord.indexOf(ch) == lowerWord.lastIndexOf(ch);
            result.append(single ? '(' : ')');
        }
        return result.toString();
    }


    @Test
    public void test() {
        assertEquals(")()())()(()()(",
                katana7.encode("Prespecialized"));
        assertEquals("))))())))",katana7.encode("   ()(   "));
    }

    @Test
    public void test2() {
        assertEquals("))((",
                katana7.encode("(( @"));
    }
}
