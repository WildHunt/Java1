package tasks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDecoder {


    public static void main(String[] args){
        Map<String, String> mymap = new HashMap<>();
        String line = "one=1&two=2&three=3";
        String[] separated = line.split("[=,&]");
        String s="";


        if (line==null)
            System.out.println("null");
        if (line.isEmpty())
            System.out.println("empty");

        if((!line.contains("=")) && (!line.contains("&"))) {
            throw new IllegalArgumentException();
        }





        try {
            for (int i=0; i<separated.length-1;i++){
                mymap.put(separated[i], separated[i+1]);
                i++;
            }
        }
        catch (IllegalArgumentException e){
            throw e;
        }


        System.out.println(mymap);

        for (int i=0; i<separated.length;i++){
           if(separated[i].isEmpty())
               System.out.println("error");
        }

    }


}
