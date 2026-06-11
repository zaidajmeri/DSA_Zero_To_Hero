package Practice_Programs.Arrays;

public class MaximumNumber {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 30};
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum Number : " + max);


    }

}
