package tasks;

/**
 * For example, given integer N = 30, rectangles of area 30 are:
 *
 * (1, 30), with a perimeter of 62,
 * (2, 15), with a perimeter of 34,
 * (3, 10), with a perimeter of 26,
 * (5, 6), with a perimeter of 22.
 */
public class MinPerimeterRectangle {


    public static void main(String[] args) {
        MinPerimeterRectangle sol = new MinPerimeterRectangle();
        System.out.println(sol.solution(30));
    }
    public int solution(int N) {
        int squareRoot = (int) Math.sqrt(N);
        int temp = 0;
        int perimeter = 0;
        int minPerimeter = Integer.MAX_VALUE;

        if(Math.pow(squareRoot, 2) != N) {
            squareRoot++;
        }
        else {
            minPerimeter = 4 * squareRoot;
        }

        for(int i=1; i<squareRoot; i++) {
            if(N % i == 0) {
                temp = N / i;
                perimeter = 2 * (temp + i);
                minPerimeter = Math.min(perimeter, minPerimeter);
            }
        }
        return minPerimeter;
    }
}