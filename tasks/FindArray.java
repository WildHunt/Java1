package tasks;

public class FindArray {
    public static void main(String[] args) {
        int[] array = {8,9,10};
        int[] sub = {8,9,10};

        FindArray sol = new FindArray();
        System.out.println(sol.findArray_one(array,sub));
    }

    public int findArray(int[] array, int[] subArray) {

        if (array.length < subArray.length) return -1;

        //int count_to = array.length - subArray.length + 1;
        for (int i = 0; i < array.length; i++) {
            int j = condition(array, i, subArray);
            if ((j != -1) && (i<= array.length)) {
                return j;
            }
        }

        return -1;
    }


    public int findArray_one(int[] array, int[] subArray) {


        int res=-1;
        if (array.length < subArray.length) return -1;
        if (array.length == subArray.length){
            return sameLength(array,subArray);
        }
        int i=0;
        while(i<array.length){
            int j = condition(array,i,subArray);
            if(j!=-1){
                res =j;
            }
            i++;
        }

        return res;
    }

    private int sameLength(int[] array, int[] subArray){
        for (int i=0; i<array.length;i++){
            if(array[i]!=subArray[i])
                return -1;
        }
        return 0;
    }


    private int condition(int[] array, int i_condition, int[] subArray) {
        for (int i = 0; i < subArray.length; i++) {
            if (array[i + i_condition] != subArray[i]) {
                return -1;
            }
        }

        return i_condition;
    }
}
