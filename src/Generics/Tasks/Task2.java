package Generics.Tasks;

//Create a normal (non-generic) class Printer
//
//Create a method:
//
//public <T> void print(T value)
//        Inside method, print value
//In main():
//Call method with int
//Call with String
//Call with double

public class Task2 {



    public static  <T> void print(T value){
        System.out.println(value);
    }

   public static void main(String[] args) {
        Integer i = 123;
        String s = "Hello";
        double d = 3.14;

        print(i);
        print(s);
        print(d);



    }

}
