package algorithms;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {

    private final Hashtable<Integer, String> table = new Hashtable<>();
    private Enumeration<Integer> enumKey;


    public static void main(String[] args) {

        HashTable ClassTable = new HashTable();
        ClassTable.table.put(1,"Roma");
        ClassTable.table.put(2,"Apple");
        ClassTable.table.put(3,"Banana");
        ClassTable.getAll();

        /**
         *        Get or Default
         */

        String definition = ClassTable.table.getOrDefault(4,"Macbook"); //if no key(4) will be Macbook
        System.out.println(definition);

        /**
         *  Put if Absent (absent - not here)
         *   if the specified key is not mapped to any value.
         */
        ClassTable.table.putIfAbsent(4,"Roma"); // Will be added
        ClassTable.table.putIfAbsent(1,"New");
        ClassTable.getAll();
    }


    private void getAll(){
        String value;
        enumKey = table.keys();
        while (enumKey.hasMoreElements()) {
            Integer key = enumKey.nextElement();
            value = table.get(key);
            System.out.println(key + " " +value);
        }
    }
}
