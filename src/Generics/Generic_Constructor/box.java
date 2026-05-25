package Generics.Generic_Constructor;

public class box {
    //in this , class is not generic, but we make constructor generic
    public <T> box(T value){
        System.out.println(value);
    }

    public static void main(String[] args){
        box box1= new box("Hi I am Zaid"); // this is without boundation
    }

}
