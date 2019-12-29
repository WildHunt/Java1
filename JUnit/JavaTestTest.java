package JUnit;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Month;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaTestTest {
    private JavaTest apple = new JavaTest();
    @Test
    @DisplayName("Fibonacchi")
    void fibonnachi() {

        int[] actual = apple.fibonnachi(39);
        int[] expected = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711,
                28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465,
                14930352, 24157817, 39088169, 63245986, 102334155};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    @EnabledOnOs({OS.WINDOWS})
    void onWindows() {
        System.out.println("Run this on Windows!");
    }

    @DisplayName("isOdd")
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE}) // six numbers
    void isOdd_ShouldReturnTrueForOddNumbers(int number) {
        assertTrue(JavaTest.isOdd(number));
    }

    @DisplayName("Is not null")
    @ParameterizedTest
    @NullSource
    void isBlank_ShouldReturnTrueForNullInputs(Integer number) {
        assertTrue(JavaTest.isNull(number));
    }

    @DisplayName("Months")
    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    void someMonths_Are30DaysLong(Month month) {
        final boolean isALeapYear = false;
        assertEquals(30, month.length(isALeapYear));
    }

    @ParameterizedTest(name = "{index} {0} is 30 days long")
    @EnumSource(value = Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    void someMonths_Are30DaysLong_Leap(Month month) {
        final boolean isALeapYear = false;
        assertEquals(30, month.length(isALeapYear));
    }

}