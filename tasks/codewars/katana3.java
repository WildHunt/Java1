package tasks.codewars;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * The new "Avengers" movie has just been released! There are a lot of people at the cinema box office standing in a
 * huge line. Each of them has a single 100, 50 or 25 dollar bill. An "Avengers" ticket costs 25 dollars.
 * Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.
 * Can Vasya sell a ticket to every person and give change if he initially has no money and sells the tickets strictly
 * in the order people queue?
 * Return YES, if Vasya can sell a ticket to every person and give change with the bills he has at hand at that moment.
 * Otherwise return NO.
 */

public class katana3 {
    public static String Tickets(int[] peopleInLine)
    {
        for(int i:peopleInLine)
            System.out.println(i);
        int d25=0;
        int d50=0;
        if(peopleInLine[0]>25)
            return "NO";
        for(int i=0; i<peopleInLine.length;i++){
           switch (peopleInLine[i]){
               case 25:
                   d25++;
                   break;
               case 50:
                   d50++;
                   d25--;
                   break;
               case 100:
                   if((d50>0) && (d25>0)) {
                       d50--;
                       d25--;
                   }
                   else if(d25>=3){
                       d25-=3;
                   }
                   else return "NO";
           }
        }
        if(d25<0)
            return "NO";
        return "YES";
    }

    @Test
    public void test1() {
        assertEquals("NO", katana3.Tickets(new int[] {25,50,100,25,25,25,50}));
    }
    @Test
    public void test2() {
        assertEquals("NO", katana3.Tickets(new int []{25, 100}));
    }
    @Test
    public void test3() {
        assertEquals("NO", katana3.Tickets(new int []{25,50,100,150,250}));
    }
    @Test
    public void test4() {
        assertEquals("YES", katana3.Tickets(new int []{25,25,25,25,50,100,50}));
    }
}

