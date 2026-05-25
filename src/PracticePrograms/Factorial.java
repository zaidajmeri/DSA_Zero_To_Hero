package PracticePrograms;
import java.util.Scanner;

public class Factorial {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number : ");
       int n  = sc.nextInt();


        int fact = 1;

        for(int i = 1; i <=n; i++){
            fact = fact * i;
        }
       if (n <= 0){
           System.out.println("Invalid Number Given");
           return;
       }


        System.out.println("Factorial is : "  + fact);
    }
}
