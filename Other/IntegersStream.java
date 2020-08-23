package Other;

import java.util.stream.IntStream;

public class IntegersStream {
    private IntStream stream = IntStream.range(0,10);

    public static void main(String[] args) {
        IntStream stream = IntStream.range(0,10);
        IntegersStream example = new IntegersStream();
        example.iterate();
    }

    /**
     * Given example produces first 10 even numbers starting from 0.
     */
    public static void iterate(){
        IntStream.iterate(0,i-> +2).limit(10); // 0,2,4,6,8..18
    }

    public void loop(){
        stream.forEach( System.out::println );  //5,6,7,8,9
    }
}
