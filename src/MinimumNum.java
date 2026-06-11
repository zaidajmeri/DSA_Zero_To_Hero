package Practice_Programs.Arrays;

public class MinimumNum {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 30};
        int minimum = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] < minimum){
                minimum = numbers[i];
            }
        }
        System.out.println(minimum + " Is Minimum Number");
    }
  }
