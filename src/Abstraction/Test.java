package Abstraction;

public class Test {
    public static void main(String[] args){
        Animal dog = new Dog();  //we can take reference of abstract class 
        dog.SayHello();

        Horse Run = new Horse();
        Run.Running();
    }
}
