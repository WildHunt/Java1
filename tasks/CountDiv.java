package tasks;

public class CountDiv {

    public static void main(String[] args) {
        CountDiv roma = new CountDiv();
//        System.out.println(roma.solution(6,11,2));
        System.out.println(roma.solution(0,0,1));


    }


    public int solution(int A, int B, int K){
        int i=A/K;
        int j=0;
        while (i<=B){
            if((A <= i*K) && (i*K<=B)) {
                j++;
            }
            i++;
        }

        return j;
    }
}
