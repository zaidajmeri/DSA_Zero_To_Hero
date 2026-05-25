package Generics.GenericMethod;

public class test {
    //if we do not want to make test object so we just need to add static in method
    public static void main(String[] args){
        Integer[] intArr = {1,2,3,4,5};
        String[] StringArr = {"Hello","World"};
        printArray(intArr);
        printArray(StringArr);
    }

    //method is like constructor but just we have to add return type here "void"
    public static  <T> void printArray(T[] array){
        for (T element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

