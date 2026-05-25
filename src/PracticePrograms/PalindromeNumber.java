package PracticePrograms;


import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = input.nextInt();


            int rev = 0;
            int temp = number;

            while(temp > 0 ){
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp = temp / 10;
            }
             if (rev == number) {
                System.out.println(number + " is a palindrome.");
            }
             else {
                 System.out.println(number + " is not a palindrome.");
             }

        }
    }

