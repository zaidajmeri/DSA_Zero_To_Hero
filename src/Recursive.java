public class Recursive {
    public static void main(String[] args){

        System.out.println("Factorial is : ");
        System.out.println(factorial(5));

        System.out.println("Sum of N Natural Number is : ");
        System.out.println(sumOFNNaturalNum(6));
    }

    //Factorial Example

    public static int factorial(int n){

        if(n == 1){
            return 1;
        }

       return n* factorial(n-1);
    }

    //Sum Of N Natural Number using Recursive method
    public static int sumOFNNaturalNum(int n){


        if (n==1){
            return 1;
        }
        return n + sumOFNNaturalNum(n -1);
    }


}
