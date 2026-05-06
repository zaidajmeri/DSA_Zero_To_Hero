public class secondLargestElement {
    public static String secondLarge(int[] arr) {
        if (arr.length < 2)
            return " Array should have at least 2 elements";
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr){
            if(num > first){
                second = first;
                first = num;
            }
            else if (num > second && num != first){
                second = num;
            }
        }
        return (second == Integer.MIN_VALUE) ? "no second largest found" : String.valueOf(second);
    }

    public static void main(String[] args) {
        int[] arr = {0,3,2,5,6,4,5,6};
        System.out.println("Second Largest Element: " + secondLarge(arr));
    }
}
