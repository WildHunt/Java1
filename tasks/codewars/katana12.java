package tasks.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Kadane’s Algorithm:
 *
 * The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or
 * list of integers:
 * Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
 *  should be 6: {4, -1, 2, 1}
 */

public class katana12 {
    public static int sequence(int[] arr) {

        if(arr.length==0)
            return 0;
        int max_total = 0, max_temp = 0;

        for (int i = 0; i < arr.length; i++)
        {
            max_temp = max_temp + arr[i];
            if (max_temp < 0)
                max_temp = 0;

            else if (max_total < max_temp)
                max_total = max_temp;

        }
        return max_total;
    }

    /**
     * Better solution
     */
    public static int sequence1(int[] arr) {
        int m = 0, a = 0, s = 0;
        for(int e : arr) {
            s += e;
            m = Math.min(s, m);
            a = Math.max(a, s - m);
        }
        return a;
    }

    public class MaxSequenceTest {
        @Test
        public void testEmptyArray() throws Exception {
            assertEquals("Empty arrays should have a max of 0", 0, katana12.sequence(new int[]{}));
        }

        @Test
        public void testExampleArray() throws Exception {
            assertEquals("Example array should have a max of 6", 6, katana12.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        }
    }
}