package Generics.Generic_Constructor;

public class test {
    public <T>   test(T value){

    }

    public static void main(String[] args) {
        test obj1 = new test("Hello My Name is Zaid");
        System.out.println(obj1);
    }
}
