public class TwoDimensionalArray {
    //lets learn two dimensional array
    //for two dimensional array we have to take two brackets for declaring array
    //for ie = int[][] arr = new int[3][3];
    //2D arrays are array of array


    //Basic Example of 2D Array
    public static void main(String[] args){
        int[][] arr = new int[3][3];
        int[][] num = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(num[1][2]);

        //traversing array
        for(int i = 0; i < num.length;i++){
            for(int j = 0; j < num.length;j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }


        //another way to declare 2D Array
        char arr2[][] = new char[3][2];
        arr2[0][0] = 'a';
        arr2[0][1] = 'b';
        arr2[1][0] = 'c';
        arr2[1][1] = 'd';
        arr2[2][0] = 'e';
        arr2[2][1] = 'f';

        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2[i].length;j++){
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }


        //Jagged Array
        //array of arrays of different length
        
    }

}
