package Generics.GenericMethod;

import java.util.Arrays;

public class Task {
        public static void main(String[] args) {
            Integer[] emptyArr = {};
            Integer[] intArr = {1,2,3,4,5};
            String[] strArr = {"Hello", "I", "Am", "Zaid"};

            //printArray(intArr);
            //printArray(strArr);

            printFirstElement(intArr);
            printFirstElement(strArr);
            printFirstElement(emptyArr);
        }


    public static <T> void printArray(T[] array){
        for(T element :array){
            System.out.println(element);
        }
    }

    public static <T> void printFirstElement(T[] array){


            if(array.length == 0 ) {
                System.out.println("array is empty " );
            }
            else {
                System.out.println(array[0]);
            }


    }

}
