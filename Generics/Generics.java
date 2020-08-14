package Generics;

import java.util.ArrayList;
import java.util.List;


/**
 * Generics uses to restrict types
 */
public class Generics {
    public static <T> void replace(List<T> list,T val){
        for(int i=0; i<list.size();i++){
            list.set(i,val);
        }
    }

    public static void main(String[] args) {
        List<String> text = new ArrayList<>();
        text.add("Fist");
        text.add("Second");
        replace(text,"New");
        System.out.println(text);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        replace(numbers,3);
        System.out.println(numbers);
    }
}

/**
 * Generic class
 * @param <T> - type of object. If we create string, we will able to put only string
 */
class Luggage <T> {
    private T data;

    public Luggage(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        Luggage<String> luggage1 = new Luggage<String>("Data");
        Luggage<Integer> luggage2 = new Luggage<Integer>(2);
        System.out.println(luggage1.data);
        System.out.println(luggage2.data);
        luggage2.setData(2);
    }
}

