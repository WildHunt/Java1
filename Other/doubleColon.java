package Other;

import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * Syntax
 * <Class name>::<method name>
 */
public class doubleColon {
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(0,10);
        stream.forEach(System.out::println);
        otherVariant();
        foreachLoop();
    }

    public static void otherVariant(){
        IntStream stream1 = IntStream.rangeClosed(0,10);
        stream1.forEach(i->System.out.println(i));
    }

    public static void foreachLoop(){
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Apple");
        stringArrayList.add("Banana");
        stringArrayList.forEach(doubleColon::print);
    }


    public static void print(String s){
        System.out.println(s);
    }
}
