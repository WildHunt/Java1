package tasks;

/**
 * Find distinct values in array
 */

import java.util.*;
public class Distinct {
    public int[] array = {1,1,2,2,3,3,3,3,3,1,1};

    public static void main(String[] args) {
        Distinct sol = new Distinct();
        System.out.println(sol.solution());

    }

    public int solution(){
        int res =0;
        Set myset = new HashSet();
        for (int i:array)
            myset.add(i);

        res = myset.size();

        return res;
    }
}
