public class Logical_operator {

    public static void main(String args[]){
        //Logical Operator
        //When we want to combine or match to condition then we use Logical Oprator

        //&& logical AND
        // || Logical OR
        // ! Logical NOT

        //for example : Logical AND (//both condition should true)
        int kaifMarks = 43;
        int kaifAge = 18;
        System.out.println(kaifMarks>=33 && kaifAge <=18);

        //for example : Logical OR(any one condition true from two condition)
        String name = "Zaid";
        int exp = 1;
        boolean GTU = true;
        boolean cond1 = exp >= 2;

        System.out.println(GTU || cond1);

        //for example logical NOT
        int a = 12;
        int b = 3;
        System.out.println(!(a>b));

    }
}
