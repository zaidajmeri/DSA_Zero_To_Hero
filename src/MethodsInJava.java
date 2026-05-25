import java.util.Locale;
import java.util.SequencedSet;

public class MethodsInJava {

    //Syntax accessModifier returntype methodname(parameters){  Method Body... }
    //method overloading means same method name but different parameters to perform different task using same method name

    public static void main(String[] args) {
        int[] a = {12, 2, 3, 3, 5, 5, 5, 5, 5};
        sumOfArray(a); // this is call method overloading


        //returning string
       String z =  upperFunc(" Zaid Ajmeri  ");
       System.out.println(z);

       //returning sum of two number
        System.out.println(sum(3,4));
        int sumRes = sum(15,50);
        System.out.println(sumRes);

        //returnig sum of 3 number
        System.out.println(sum(1,3,3    ));

        //varargs example
        System.out.println(sum(1,3,3));


        //number is prime or not
        System.out.println(isPrime(13));
        System.out.println(isPrime(20));

    }


    public static void sumOfArray(int[] arr) {
        int res = 0;
        for (int i : arr) {

            res += i;
        }
        System.out.println(res);
    }


    //lets try from String return type
    private static String upperFunc(String str) {
        return str.trim().toUpperCase();
    }

    //returning sum of two numbers
    private static int sum(int a, int b){
        return a + b;
    }

    //Method Overloading
    //Sum of three number using same sum() method
    private static int sum(int a, int b, int c){
        return a+ b+c;
    }

    //varargs = variable args
    //in this varargs we are not passing an array, we are passing variable arguments
    public static int sum(int...a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    //Check the number is prime or not
    //the prime number is divided by itselt or by 1, if the number divided from only two number then it is prime


    public static boolean isPrime(int x){
        int res = 0;
        for(int i = 1;i < x / 2 ; i++ ){
            if(x % i ==0){
                res++;
            }
        }
        return res ==1;
    }

}