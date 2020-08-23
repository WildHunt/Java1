package Other;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntegersStream {

    public static void main(String[] args) {
        IntegersStream example = new IntegersStream();
        example.iterate();
        example.filterPrime();
        mapStreams();
        parallelStream();
        sortStream();
    }

    /**
     * Given example produces first 10 even numbers starting from 0.
     */
    public static void iterate(){
        IntStream.iterate(0,i-> +2).limit(10); // 0,2,4,6,8..18
    }

    /**
     * For each
     */
    public void loop(){
        IntStream stream = IntStream.range(0,10);
    }


    /**
     * Collections can not store the primitive values directly. They can store only instances/objects.
     * So, use boxed()
     */
    public void filterPrime(){
        IntStream stream1 = IntStream.range(0,10);
        List<Integer> list = stream1.filter(IntegersStream::isEven).boxed().collect(Collectors.toList());
        IntStream stream2 = IntStream.range(0,10);
        List<Integer> primes = stream2.filter(IntegersStream::isPrime).boxed().collect(Collectors.toList());
    }

    public static boolean isEven(int i) {
        IntPredicate evenPred = index -> i>5;
        return evenPred.test(i);
    }

    /**
     * Explain: input i=3; check if 3%2==0;
     * Input i=4, check if 4%2==0; if 4%3==0
     * noneMatch returns true, if all conditions false
     */
    public static boolean isPrime(int i) {
        IntPredicate isDivisible = index -> i % index == 0;
        return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
    }

    /**
     * Just to array
     */
    public static int[] toArray(){
        return IntStream.range(0,10).toArray();
    }

    public static void mapStreams(){
        IntStream.range(0,10).map((x-> (int) Math.pow(x,2)));
    }

    /**
     * Just parallel
     */
    public static void parallelStream(){
        IntStream.rangeClosed(0,1000).map(x->x*x).parallel();
    }

    public static void sortStream(){
        IntStream.generate(() -> (int) (Math.random() * 1000)).limit(10).sorted().forEach(System.out::println);
    }

}
