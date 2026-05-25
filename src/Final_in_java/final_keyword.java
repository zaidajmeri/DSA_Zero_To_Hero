    package Final_in_java;

    public class final_keyword {
        //the final keyword in java is a non- access modifier used to prevent modification. it can be applied to
        // variable- Value cant be change , Methods - cant be overridden, classes- cant be extended.

        public static void main(String[] args){
             final double PI = 3.14159;

             System.out.println("value of PI : " + PI);

            // PI = 3.14;  //this will give error because we put final in variable

                      }
        public final void airBags(){
            System.out.println("4 airbags");

        }


        }

