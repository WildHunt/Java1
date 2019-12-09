package tasks;

public class StringUnique {
    public static void main(String[] args) {
        String input = "abcdefgt";
            if (input.length()>256)
                System.out.println("Not unique");
        char[] inputArr = input.toCharArray();
        boolean[] alphabet = new boolean[256];
        int valid=0;
        for (int i=0; i<inputArr.length;i++){
            valid = inputArr[i];
                if (alphabet[valid] == true){
                    System.out.println("Not unique");
                    break;
                }
            alphabet[valid] = true;
        }
       System.out.println("end");
    }
}



