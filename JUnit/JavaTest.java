package JUnit;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaTest {
    private int[] fibo = new int[40];

    public static void main(String[] args) {
        JavaTest test = new JavaTest();
        test.fibonnachi(39);
        for (int i=0; i<test.fibo.length;i++){
            System.out.print(test.fibo[i] + " ");
        }
        System.out.println(test.fibo.length);

    }

    public  int[] fibonnachi (int counter){
        int a0=1;
        int a1=1;
        int a2=0;
        fibo[0]=1;
        fibo[1]=1;
        for (int i=2; i<=counter; i++){
            a2=a0+a1;
            a0=a1;
            a1=a2;
            fibo[i]=a2;
        }

        return fibo;

    }

    @Override
    public String toString() {
        return "JavaTest{" +
                "fibo=" + Arrays.toString(fibo) +
                '}';
    }
}
