package tasks.codewars;

import org.junit.Test;

import java.util.HashMap;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

/**
 * Write a function that takes a string of braces, and determines if the order of the braces is valid. It should return
 * true if the string is valid, and false if it's invalid.
 *
 * This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets [], and curly braces {}.
 * Thanks to @arnedag for the idea!
 *
 * All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.
 */
public class katana10 {

    /**
     * Best solution without Stack
     */
    public boolean isValid(String braces) {
        for(int i = 0; i < braces.length(); i++){
            braces = braces.replace("{}", "").replace("[]", "").replace("()", "");
        }
        return braces.isEmpty();
    }

    @Test
    public void testValid() {
        assertEquals(true, isValid("()"));
    }

    @Test
    public void testInvalid() {
        assertEquals(false, isValid("[(])"));
    }
}
