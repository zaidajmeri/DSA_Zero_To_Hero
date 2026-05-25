public class array {
    public static void main(String[] args) {
        //collection of similer kind of data is called array
        //Syntax : type[] variableName ;
        //When we want collection of similer kind of data then  we have to think about array
        //array starting address will be stored in array and after that from second store in heap memory
        //every array has its own property length that holds size of array
        //jab ham new keyword use karte he vo heap me hota he and local variable stored in stack
        int[] arr = {1, 2, 3};
        System.out.println(arr[0]); //printing array element

        int[] arr2 = new int[5];
        System.out.println(arr2[3]); // in array indexing start with 0

        //traversisng array
        int[] Arri = new int[20];
        for (int i = 0; i <= Arri.length; i++)
        {
          //  System.out.println(Arri[i]);
            //assingning values
            Arri[2] = 22;
            Arri[5] = 25;
        }

        int[] arr3 = {1,2,3,4,5};
        System.out.println(arr3[3]);

        //find an element in an array
        int searchArr[] = {1,21,54,5,8,1};
        for(int searchI : searchArr){
            if(searchI == 54){
                System.out.println("Found");
            }

        }

        //find maximum number in array

        int[] Maxarr = new int[5];
        Maxarr[0] = 21;
        Maxarr[1] = 2521;
        Maxarr[2] = 254;
        Maxarr[3] = 24;
        Maxarr[4] = -2;
        int MaxArrRes = Integer.MIN_VALUE;

        for(int i = 0; i < Maxarr.length; i++){
            if (Maxarr[i] > MaxArrRes){
                MaxArrRes = Maxarr[i];
            }
        }
        System.out.println(MaxArrRes);

        //reverse array
        int[] revArr = {1,5,2,56,63,4};
        for (int i = revArr.length-1; i >= 0; i--){
            System.out.println(revArr[i]);
        }

        //sum of array
        int[] sumArr = {2,-5,12,-4,-23,44,-7};
        int sum = 0;
        for(int i : sumArr){
            sum = sum + i;
        }
    System.out.println(sum);







    }
}
