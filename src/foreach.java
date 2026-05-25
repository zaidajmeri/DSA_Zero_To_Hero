public class foreach {
    public static void main(String[] args){
        //foreach loop always works in array, work with collection of numbers
        //syntax of for each loop
        //for(datatype variableName : arrayName){ }

        int[] forarr1 = {1,25,3,40};
        for(int forI : forarr1 ){
            System.out.println(forI);
        }

        //search an element in array
        int searchArr[] = {1,2,55,54,3,26,45,4};
        for(int i : searchArr){
            if (i == 26){
                System.out.println("Found");
            }

        }

    }

}
