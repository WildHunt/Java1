package tasks;

import java.util.*;

public class CommonPrimeDivisors {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> mymap = new HashMap<>();
        mymap.put(0,Arrays.asList(1,2,3));

        mymap.put(1,Arrays.asList(4,5));
        ArrayList<Integer> array = new ArrayList();
        array.add(-2);
        array.add(-1);
        mymap.put(2, new ArrayList<>(array));

        array.clear();
        array.add(-10);
        mymap.put(3, new ArrayList<>(array));

        System.out.println(mymap);
    }
}
