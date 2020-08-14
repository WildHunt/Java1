package tasks.codewars;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class katana2 {

    public static boolean comp(int[] a, int[] b) {
        if ((a==null) || (b==null))
            return false;
        for(int i=0; i<a.length;i++){
            a[i] = a[i] *a[i];
        }
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.compare(a, b)==0) return true;
        else return false;
    }

    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(true, katana2.comp(a, b));
    }
}
