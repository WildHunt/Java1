package tasks.codewars;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.regex.Pattern;

/**
 * ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
 *
 * If the function is passed a valid PIN string, return true, else return false.
 */

public class katana4 {
    public static boolean validatePin(String pin) {
        System.out.println(pin);
        Pattern pattern = Pattern.compile(".*[^0-9].*");
        if ((pin.length()==4) || (pin.length()==6)) {
            return !pattern.matcher(pin).matches();
        }
        return false;
    }

    /**
     * The best solution
     */
    public static boolean validatePinBest(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
        //return pin.matches("[0-9]{4}|[0-9]{6}");
    }



    @Test
    public void validPins() {
        assertEquals(true, katana4.validatePin("1234"));
        assertEquals(true, katana4.validatePin("0000"));
        assertEquals(true, katana4.validatePin("1111"));
        assertEquals(true, katana4.validatePin("123456"));
        assertEquals(true, katana4.validatePin("098765"));
        assertEquals(true, katana4.validatePin("000000"));
        assertEquals(true, katana4.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertEquals(false, katana4.validatePin("a234"));
        assertEquals(false, katana4.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        assertEquals(false, katana4.validatePin("1"));
        assertEquals(false, katana4.validatePin("12"));
        assertEquals(false, katana4.validatePin("123"));
        assertEquals(false, katana4.validatePin("12345"));
        assertEquals(false, katana4.validatePin("1234567"));
        assertEquals(false, katana4.validatePin("-1234"));
        assertEquals(false, katana4.validatePin("1.234"));
        assertEquals(false, katana4.validatePin("00000000"));
    }

    @Test
    public void edgeCases() {
        assertEquals(false, katana4.validatePin("123"));
        assertEquals(false, katana4.validatePin("12345"));
        assertEquals(false, katana4.validatePin("1234567"));
        assertEquals(false, katana4.validatePin("1234x"));
        assertEquals(false, katana4.validatePin("12.0"));
        assertEquals(false, katana4.validatePin("-44444"));
        assertEquals(false, katana4.validatePin("+111"));
        assertEquals(false, katana4.validatePin("00000000"));
    }
}