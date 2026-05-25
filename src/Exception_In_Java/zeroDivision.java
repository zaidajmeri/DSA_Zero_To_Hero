package Exception_In_Java;

public class zeroDivision {
    public static void main(String[] args){
        int[] numerators = {10,20,30,40};
        int[] denumerators = {1,2,0,3};
        for(int i = 0; i< numerators.length; i++){
            System.out.println(divide(numerators[i],denumerators[i]));
        }
        System.out.println("good");
    }
    public static int divide(int a, int b){
        try {
            return a/b;
        }
            catch (ArithmeticException e){
            System.out.println(e);
            return -1;
        }
    }
}