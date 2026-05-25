import com.sun.source.tree.WhileLoopTree;

public class javaLoops {

    public static void main(String[] args) {

        //while loop
        //syntax : while(i > 0){ //code; )

        //what is it hindi of while :-> jabtak while parameter ki condition true rahegi uska code chalta rahega
        //as long as this condition remains true this work will keep happening

        int i = 0;
        while (i < 10) {
            System.out.println("Hello Kaif");
            i = i + 1;

            int i2 = 1;
            while (i2 <= 50) {
                System.out.println(i2);
                i2++;
            }


            //Do While Loop
            //int this there is first code will run then after condition to be execute
            int i3 = 100;
            do {
                System.out.println(i3);
                i3++;
            } while (i3 <= 50);

            //For Loop
            //syntax  for(initialization; condition; update){ //code }//
            // int forI = 0;

            //we can do everything in for loop brackets

            for (int forI = 0; forI <= 10; forI++) {
                System.out.println(forI);
            }


            //pattern based questiona

            for (int j = 1; j <= 10000; j = j * 10) {
                System.out.println(j);
            }

            for (int forI2 = 1, j2 = 1; j2 <= 6; forI2 = forI2 * 10, j2++) {
                System.out.println(forI2);
            }

            //7th table
            for (int sevenTable = 1; sevenTable <= 10; sevenTable++) {
                System.out.println(sevenTable + " X 7 =" + sevenTable * 7);


            }

            //printing first 10 natural number
            int sum = 0;
            int iNat = 1;
            while (iNat <= 10) {
                sum = sum + iNat;
                iNat++;
            }
            System.out.println(sum);


            //number of digit and destroying them
            int n = 565645664;
            int result = 0;
            while (n > 0){
                n = n/10;
                result++;


            }
            System.out.println(result);

            //factorial of a number  = 6  == 6.5.4.3.2.1
            int fact = 6;
            int resulFact = 1;
            while (fact > 0){
                resulFact = resulFact * fact;
                fact--;

                System.out.println(resulFact);
            }

            //printing this star pattern
//            *
//            **
//            ***
//            ****
//            *****
//            ******

            for (int pat = 0; pat<6;pat++){
                for (int star = 0 ; star <= pat; star++){
                    System.out.print("*");
                }
                System.out.println();
            }



        }
    }
}





