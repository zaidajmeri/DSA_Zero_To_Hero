package Generics.GenericMethod;

//in this example we are overload two methods
public class MethodOverloadingWithGeneric {
    public static void main(String[] args){
        Integer[] arr = {1,2,3,2};
        String[] str = {"Hello", "World"};
        display(12); //this goes to direct Integere Method
        display("hello"); //this goes to generic method
        display(12.5);

    }


    //generic method with type param
    public static <T> void display(T element){
        System.out.println("Generic Display " + element);
    }


    //specific method (in this case "Integer")
    public static void display(Integer element){
        System.out.println("Integer Display " + element);
    }

    public static  <T> void printArr(T[] array){
        for (T element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
