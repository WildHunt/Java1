package tasks.codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in
 * the form of a phone number.
 */
public class katana9 {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder output = new StringBuilder();
        output.append('(');
        for(int i=0;i<numbers.length;i++){
            if(i==3)
                output.append(") ");
            if(i==6)
                output.append('-');
            output.append(numbers[i]);

        }
        return output.toString();
    }

    /**
     * Phone format
     */
    public static String createPhoneNumber1(int[] numbers) {
        String phoneNumber = new String("(xxx) xxx-xxxx");

        for (int i : numbers) {
            phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
        }

        return phoneNumber;
    }

    public static String createPhoneNumber3(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
    }


    @Test
    public void tests() {
        assertEquals("(123) 456-7890", katana9.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
