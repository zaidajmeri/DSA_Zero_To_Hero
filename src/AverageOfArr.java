package Practice_Programs.Arrays;

public class AverageOfArr {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        double sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        double average = sum / arr.length;
        System.out.println("Average " + average);

    }
}
