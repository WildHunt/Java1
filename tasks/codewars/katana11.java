package tasks.codewars;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoublePredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static org.junit.Assert.assertEquals;

/**
 * In effect: 89 = 8^1 + 9^2
 *
 * The next number in having this property is 135.
 *
 * See this property again: 135 = 1^1 + 3^2 + 5^3
 * We need a function to collect these numbers, that may receive two integers a, b that defines the
 * range [a, b] (inclusive) and outputs a list of the sorted numbers in the range that
 * fulfills the property described above.
 */
public class katana11 {

    public static List<Long> sumDigPow(long a, long b) {
        LongStream longStream = LongStream.rangeClosed(a,b);
        return longStream.filter(katana11::checkDigit).parallel().boxed().collect(Collectors.toList());
    }

    public static boolean checkDigit(long input){
        Long digit;
        double sum=0l;
        boolean valid;
        for(int i=0;i< Long.toString(input).length();i++){
            digit = Long.parseLong(String.valueOf((Long.toString(input).charAt(i))));
            sum = sum+ Math.pow(digit,i+1);
        }

        return isValid(sum, input);
    }

    public static boolean isValid(double sum, long input){
        DoublePredicate predicate = index -> sum == input;
        return predicate.test(sum);
    }

    /**
     * Almost the  same as my, but using mapTo code is more elegant
     */
    private static boolean isValidBetter(long x){
        String value = Long.toString(x);
        return IntStream.range(0, value.length())
                .mapToDouble(i -> Math.pow(Character.getNumericValue(value.charAt(i)), i + 1))
                .sum() == x;
    }

    private static void testing(long a, long b, long[] res) {
        assertEquals(Arrays.toString(res),
                Arrays.toString(katana11.sumDigPow(a, b).toArray()));
    }

    @Test
    public void test() {
        System.out.println("Basic Tests");
        testing(1, 10, new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        testing(1, 100, new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 89});
        testing(10, 100,  new long[] {89});
        testing(90, 100, new long[] {});
        testing(90, 150, new long[] {135});
        testing(50, 150, new long[] {89, 135});
        testing(10, 150, new long[] {89, 135});
    }
}
