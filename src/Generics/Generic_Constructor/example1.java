package Generics.Generic_Constructor;

public class example1 <T>{
    private T value; //instance variable

    //generic constructor
    public example1(T value){
        this.value = value;
    }

    // why we use generic constructor - for flexibility for object creation

    //printing method
    public void printConstructor(){
        System.out.println(value);
    }

    //main class
    public static void main(String[] args) {
        example1 example1 = new example1("Hello");
        example1.printConstructor();
    }
}
