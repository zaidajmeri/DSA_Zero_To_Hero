import java.sql.SQLOutput;

public class  conditional_statement {

    public static void main(String args[]) {

        //If Else
        int age = 20;
        int marks = 33;
        if (age >= 21 && marks >= 33) {
            System.out.println("You are eligible for UPSC exam");
        } else {
            System.out.println("You are not eligible for exam, please continue your preparation for future exams");
        }

        //Else If

        int YourMarks = 65;
        if (YourMarks >= 90) {
            System.out.println("Grade A");
        } else if (YourMarks >= 75) {
            System.out.println("Grade B");
        } else if (YourMarks >= 60) {
            System.out.println("Grade C");
        } else if (YourMarks >= 40) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade E");
        }

        //Switch Case Statement

        //we can use switch case using byte,short,char,int,String,Enum types all data types
        int day = 5;

        switch (day) {
            case 1:{
                System.out.println("Monday");
                break;
                }
            case 2: {
            System.out.println("Tuesday");
            break;
            }
            case 3:{
                System.out.println("Wednesday");
                break;
            }
            case 4:{
                System.out.println("Thursday");
                break;
            }
            case 5: {
                System.out.println("Friday");
                break;
            }
            case 6: {
                System.out.println("Saturday");
                break;
            }
            case 7:{
                System.out.println("Sunday");
                break;
            }
            default: {
                System.out.println("Invalid Day");

            }


        }
    }
}
