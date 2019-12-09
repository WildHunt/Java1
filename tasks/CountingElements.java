package tasks;
import java.util.Arrays;

public class CountingElements {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int N = 5;
        int[] arr = {3,4,4,6,1,4,4};
        int[] sol = new int[N];

        condition(N,arr,sol);

        long estimatedTime = System.nanoTime() - startTime;
        System.out.printf("Elapsed %,9.3f ms\n", estimatedTime/1_000_000.0);


        for (int i : sol)
       System.out.print(i);


    }

    public int[] input(int N, int[] array){
        return array;
    }

    public static int findMaxCouner(int[] sol){
        Arrays.sort(sol);
        int counter = sol[sol.length -1];
        return counter;
    }

    public static int[] maxCounter(int[]sol) {
        int counter = 0;
        counter = findMaxCouner(sol);
        Arrays.fill(sol,counter);
        return sol;
    }


    public  static int[] condition(int N, int[] array, int[] sol){
        int j=0;

        for (int i=0; i<array.length; i++){
            if (array[i] <= N) {
                j = array[i];
                sol[j-1]++;
            }
            else {
                maxCounter(sol);
            }
        }
        return array;
    }
}
//[3, 2, 2, 4, 2],