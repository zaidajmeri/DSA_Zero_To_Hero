package PracticePrograms;
import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;
        int originalNumber = number;

        while(number > 0){
            int digit =  number % 10;
            sum = sum + digit * digit * digit;
            number = number / 10;
        }

        if(sum == originalNumber){
            System.out.println(originalNumber + " is an Armstrong number.");
        }
        else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
