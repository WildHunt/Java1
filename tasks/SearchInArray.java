package tasks;


public class SearchInArray {
    public static void main(String[] args) {
        int[] A = {9,4,2,3,0,5};
        int[] B = {1,2,3,4,5,6,7,8};
        int[] arr = {1,2,3,5,6};
        two_unique_elements(A);
        permutation(arr);

    }

    /** Searching for 2 same elements in array. Only 2 elements same
     *  Input {1,1,2,3,4} return 0 means some elements are same
     * @param A
     */
    public static void two_unique_elements(int[] A){
        int a=A[0];
        for (int i=1;i< A.length;i++){
            a = a^A[i]; // 0 means that 2 same elements
        }
        System.out.println(a);
    }

    /**
     * Is a permutation?
     * @param A
     */
    public static void permutation(int[] A){
        int result = 0;
        for (int i = 1; i <= A.length + 1; i++)
            result ^= i;
        System.out.println(result);
        for (int i = 0; i < A.length; i++)
            result ^= A[i];
        System.out.println("Res is: " + result);

    }


}
